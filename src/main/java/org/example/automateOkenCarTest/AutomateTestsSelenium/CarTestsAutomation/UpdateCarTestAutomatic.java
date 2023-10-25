package org.example.automateOkenCarTest.AutomateTestsSelenium.CarTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UpdateCarTestAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Accès à la liste des managers
        driver.get("http://oken-cars.local/car-list");

        //Accès au boutton de mise à jour
        driver.findElement(By.xpath("//*[@id=\"editButton\"]")).click();

        //remplissage formulaire de mise a jour (effacer ancien contenu et le remplacer
        driver.findElement(By.name("model")).clear();
        driver.findElement(By.name("model")).sendKeys("4x4"); // Nom
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        driver.findElement(By.name("color")).clear();
        driver.findElement(By.name("color")).sendKeys("/////"); // Prénom
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        //Validation du formulaire
        driver.findElement(By.xpath("/html/body/app-root/app-edit-car/div/div[2]/form/button")).click();

    }
}
