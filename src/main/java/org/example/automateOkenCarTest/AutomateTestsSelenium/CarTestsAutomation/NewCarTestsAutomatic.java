package org.example.automateOkenCarTest.AutomateTestsSelenium.CarTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class NewCarTestsAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        //Attente avant bon remplissage
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        driver.get("http://oken-cars.local/new-car");

        //maximiser affichage ecran
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes


        //Remplissage du formulaire
        //Automatisation remplissage et validation d'un formulaire (VALIDITE)
        driver.findElement(By.name("brand")).sendKeys("Toyota");
        driver.findElement(By.name("mileage")).sendKeys("600000");

        WebElement selectModel = driver.findElement(By.id("inputGroupSelect01"));
        Select select_model = new Select(selectModel);
        select_model.selectByValue("Volkswagen");

        WebElement selectColor = driver.findElement(By.id("inputGroupSelect02"));
        Select select_color = new Select(selectColor);
        select_color.selectByValue("Pink");

        //Simuler l'appui sur la touche tabulation
        action.sendKeys(Keys.TAB).perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));//Timer 25 secondes

        //Validation du formulaire
        driver.findElement(By.xpath("/html/body/app-root/app-new-car/div/div/form/button")).click();

    }
}
