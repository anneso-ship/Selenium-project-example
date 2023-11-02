package org.example.automateOkenCarTest.AutomateTestsSelenium.CustomerTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class NewCustomerTestsAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        //Attente avant bon remplissage
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        driver.get("http://oken-cars.oken.lan/home");

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Aller dans la partie customer
        driver.findElement(By.xpath("/html/body/app-root/app-home/div/a[4]")).click();

        //Aller dans la partie customer "inscription"
        driver.findElement(By.xpath("/html/body/app-root/app-login-customer/div/div[2]/table/tr/td[2]/a/strong/i")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes


        //Remplissage du formulaire
        //Automatisation remplissage et validation d'un formulaire (VALIDITE)
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Sow");
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Mamadou");
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("+221 771234567");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mamadou.sow@hotmail.fr");
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("12 Rue Dakar, Dakar");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Senegal123!");
        driver.findElement(By.xpath("/html/body/app-root/app-register-customer/div/div/div[2]/div[6]/div[2]/input")).sendKeys("Senegal123!");

        //Simuler l'appui sur la touche tabulation
        action.sendKeys(Keys.TAB).perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));//Timer 25 secondes

        //Validation du formulaire
        driver.findElement(By.xpath("/html/body/app-root/app-register-customer/div/div/div[2]/button")).click();

    }
}
