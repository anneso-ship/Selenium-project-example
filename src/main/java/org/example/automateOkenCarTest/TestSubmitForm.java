package org.example.automateOkenCarTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestSubmitForm {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        //Attente avant bon remplissage
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));//Timer 25 secondes

        //Attente avant bon remplissage
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));//Timer 25 secondes

        driver.get("http://oken-cars.local/home");

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Aller dans la partie manager
        driver.findElement(By.xpath("/html/body/app-root/app-home/div/a[2]")).click();

        //Aller dans la partie manager "inscription"
        driver.findElement(By.xpath("/html/body/app-root/app-login-manager/div/div[2]/table/tr/td[2]/a")).click();

        //Remplissage du formulaire
        //Automatisation remplissage et validation d'un formulaire (VALIDITE)
        driver.findElement(By.name("lastname")).sendKeys("Sow"); // Nom
        driver.findElement(By.name("firstname")).sendKeys("Mamadou"); // Prénom
        driver.findElement(By.name("email")).sendKeys("mamadou.sow@hotmail.fr"); // Adresse mail
        driver.findElement(By.name("phone")).sendKeys("+221 771234567"); // Numéro de téléphone
        driver.findElement(By.name("address")).sendKeys("12 Rue Dakar, Dakar"); // Adresse
        driver.findElement(By.name("password")).sendKeys("Senegal123!"); // Mot de passe
        driver.findElement(By.name("confirmPassword")).sendKeys("Senegal123!"); // Confirmation du mot de passe

        //Simuler l'appui sur la touche tabulation
        action.sendKeys(Keys.TAB).perform();

        //Validation du formulaire
        driver.findElement(By.xpath("/html/body/app-root/app-register-manager/div/div/form/button")).click();

    }

}
