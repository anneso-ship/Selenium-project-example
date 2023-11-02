package org.example.automateOkenCarTest.AutomateTestsSelenium.CustomerTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UpdateCustomerTestAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Accès à la liste des managers
        driver.get("http://oken-cars.oken.lan/customer-list");

        //Accès au boutton de mise à jour
        driver.findElement(By.xpath("/html/body/app-root/app-customer-list/div/table/tbody/tr[1]/td[5]/div/div[2]/button")).click();

        //remplissage formulaire de mise a jour (effacer ancien contenu et le remplacer
        driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Ndiay~]e"); // Nom
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Ibr123ahima"); // Prénom
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        //Validation du formulaire
        driver.findElement(By.xpath("/html/body/app-root/app-edit-customer/div/div/div[2]/td/button")).click();

    }
}
