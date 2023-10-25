package org.example.automateOkenCarTest.AutomateTestsSelenium.OwnerTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UpdateOwnerTestAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Attente avant bon remplissage
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(25));//Timer 25 secondes

        driver.get("http://oken-cars.local/owner-list");

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Accès au boutton de mise à jour
        driver.findElement(By.xpath("/html/body/app-root/app-owner-list/div/table/tbody/tr[2]/td[5]/div/div[2]/button")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("Ndiaye.Ibrahima78@outlook.fr"); // Adresse mail

        //remplissage formulaire de mise a jour (effacer ancien contenu et le remplacer
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Ndiay~]e"); // Nom


    }
}
