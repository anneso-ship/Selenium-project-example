package org.example.automateOkenCarTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestFormAutofillWithBadData {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://oken-cars.local/sign-up ");

        //maximiser affichage ecran
        driver.manage().window().maximize();


        Actions action = new Actions(driver);

        //Automatisation remplissage et validation d'un formulaire (invalidité)
        driver.findElement(By.name("lastname")).sendKeys("Bamoni"); //Nom
        driver.findElement(By.name("firstname")).sendKeys("Anne1Sophie");//Prénom
        driver.findElement(By.name("email")).sendKeys("sophiebayahoo.com");//Adresse mail
        driver.findElement(By.name("phone")).sendKeys("@752389521"); //Numéro de téléphone
        driver.findElement(By.name("address")).sendKeys("6 Rue Stendhal");// Adresse
        driver.findElement(By.name("password")).sendKeys("Azert!");//mot de passe
        driver.findElement(By.name("confirmPassword")).sendKeys("Azerty123!");//Confirmation mp

        //Simuler l'appui sur la touche tabulation
        action.sendKeys(Keys.TAB).perform();

       /* action2.sendKeys(Keys.TAB).perform();
        WebElement validation = driver2.findElement(By.xpath("/html/body/app-root/app-register-manager/div/div/form/button"));
        validation.submit();*/
    }
}
