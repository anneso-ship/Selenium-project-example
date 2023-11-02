package org.example.automateOkenCarTest.AutomateTestsSelenium.DriverTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class NewDriverTestsAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        //Attente avant bon remplissage
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        driver.get("http://oken-cars.oken.lan/home");

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Aller dans la partie driver
        driver.findElement(By.xpath("/html/body/app-root/app-home/div/a[1]")).click();

        //Aller dans la partie driver "inscription"
        driver.findElement(By.xpath("/html/body/app-root/app-login-driver/div/div[2]/table/tr/td[2]/a/strong/i")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes


        //Remplissage du formulaire
        //Automatisation remplissage et validation d'un formulaire (VALIDITE)
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Sow123");
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Mamadou");
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("+221 771234567");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mamadou.sowhotmail.fr");
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("12 Rue Dakar, Dakar");
        driver.findElement(By.name("password")).sendKeys("Senegal123!");
        driver.findElement(By.name("confirmPassword")).sendKeys("Senegal123!");

        WebElement selectPermitType= driver.findElement(By.id("permit"));
        Select select_permit_type = new Select(selectPermitType);
        select_permit_type.selectByValue("D");

        //Simuler l'appui sur la touche tabulation
        action.sendKeys(Keys.TAB).perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));//Timer 25 secondes

        //Validation du formulaire
        driver.findElement(By.xpath("/html/body/app-root/app-register-driver/div/div/div[2]/button")).click();

    }
}
