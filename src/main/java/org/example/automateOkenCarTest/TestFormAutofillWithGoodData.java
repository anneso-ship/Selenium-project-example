package org.example.automateOkenCarTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestFormAutofillWithGoodData {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        //Attente avant bon remplissage
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));//Timer 25 secondes


        //Attente avant bon remplissage
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));//Timer 25 secondes


        driver.get("http://oken-cars.local/sign-up ");

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Automatisation remplissage et validation d'un formulaire (VALIDITE)
        driver.findElement(By.name("lastname")).sendKeys("Bamoni"); //Nom
        driver.findElement(By.name("firstname")).sendKeys("Anne Sophie");//Prénom
        driver.findElement(By.name("email")).sendKeys("sophiebamoni@yahoo.com");//Adresse mail
        driver.findElement(By.name("phone")).sendKeys("+33 0752389521"); //Numéro de téléphone
        driver.findElement(By.name("address")).sendKeys("6 Rue Stendhal");// Adresse
        driver.findElement(By.name("password")).sendKeys("Azerty123!");//Mot de passe
        driver.findElement(By.name("confirmPassword")).sendKeys("Azerty123!");//Confirmation mot de passe

        //Simuler l'appui sur la touche tabulation
        action.sendKeys(Keys.TAB).perform();

       // WebElement validation = driver.findElement(By.xpath("/html/body/app-root/app-register-manager/div/div/form/button"));
        //validation.submit();

    }
}
