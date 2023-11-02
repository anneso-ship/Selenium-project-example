package org.example.automateOkenCarTest.AutomateTestsSelenium.ManagerTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UpdateManagerTestAutomatic {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Accès à la liste des managers
        driver.get("http://oken-cars.oken.lan/manager-list");

        //Accès au boutton de mise à jour
        driver.findElement(By.xpath("//*[@id=\"editButton\"]")).click();

        //remplissage formulaire de mise a jour (effacer ancien contenu et le remplacer
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("123"); // Nom

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Sam"); // Prénom

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("Ndiaye.Ibrahima78@outlook.fr"); // Adresse mail

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        //Validation du formulaire
        driver.findElement(By.xpath("/html/body/app-root/app-edit-manager/div/div/div[2]/form/button")).click();

    }
}
