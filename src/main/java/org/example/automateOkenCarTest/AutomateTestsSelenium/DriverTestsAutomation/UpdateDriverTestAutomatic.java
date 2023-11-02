package org.example.automateOkenCarTest.AutomateTestsSelenium.DriverTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UpdateDriverTestAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Accès à la liste des managers
        driver.get("http://oken-cars.oken.lan/driver-list");

        //Accès au boutton de mise à jour
        driver.findElement(By.xpath("/html/body/app-root/app-driver-list/div/table/tbody/tr/td[5]/div/div[2]/button")).click();

        //remplissage formulaire de mise a jour (effacer ancien contenu et le remplacer
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("///123");

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Nd]]]iay~]e");


        //Validation du formulaire
        driver.findElement(By.xpath("/html/body/app-root/app-edit-driver/div/div/div[2]/td/button")).click();

    }
}
