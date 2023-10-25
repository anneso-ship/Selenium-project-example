package org.example.automateOkenCarTest.AutomateTestsSelenium.OwnerTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class NewOwnerTestAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        //Attente avant bon remplissage
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes

        driver.get("http://oken-cars.local/home");

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Aller dans la partie owner
        driver.findElement(By.xpath("/html/body/app-root/app-home/div/a[3]")).click();

        //Aller dans la partie owner "inscription"
        driver.findElement(By.xpath("/html/body/app-root/app-login-owner/div/div[2]/table/tr/td[2]/a")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));//Timer 25 secondes


        //Remplissage du formulaire
        //Automatisation remplissage et validation d'un formulaire (VALIDITE)
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("So123w"); // Nom
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Mamadou"); // Prénom
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("mamadou.sowhotmail.fr"); // Adresse mail
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("+221 771234567"); // Numéro de téléphone
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("12 Rue Dakar, Dakar"); // Adresse
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Senegal123!"); // Mot de passe
        driver.findElement(By.xpath("/html/body/app-root/app-register-owner/div/div/div[2]/div[6]/div[2]/input")).sendKeys("Senegal123!"); // Confirmation du mot de passe

        //Simuler l'appui sur la touche tabulation
        action.sendKeys(Keys.TAB).perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));//Timer 25 secondes

        //Validation du formulaire
        driver.findElement(By.xpath("/html/body/app-root/app-register-owner/div/div/div[2]/button")).click();

    }
}
