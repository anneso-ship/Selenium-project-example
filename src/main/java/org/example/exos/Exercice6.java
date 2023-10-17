package org.example.exos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercice6 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Remplissage formulaire de connexion
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Dfr%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F%253Fgl%253DFR%2526hl%253Dfr%2526themeRefresh%253D1&ec=65620&hl=fr&ifkv=AVQVeyzRagBEPgxdWb8U4azpXfCeXf2YzkM8BRa9M762mPOn_qcJV-gD-ZiRMbtQn6miYTHBqkmbOQ&passive=true&service=youtube&uilel=3&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1829032745%3A1697580403845114&theme=glif");
        WebElement name = driver.findElement(By.name("identifier"));
        name.sendKeys("sophiebamoni@yahoo.com");

        /**
         *
         *   WebDriverManager.chromedriver().setup();
         *         WebDriver driver = new ChromeDriver();
         *
         *         //maximiser affichage ecran
         *         driver.manage().window().maximize();
         *
         *         //Accès à la page web
         *         driver.get("https://www.facebook.com/");
         *
         *         //Accépter cookies
         *         driver.findElement(By.cssSelector("#u_0_k_BY")).click();//Simuler click sur le boutton "accépter les cookies"
         *
         *         //Remplissage formulaire de connexion
         *         WebElement email = driver.findElement(By.name("email"));
         *         email.sendKeys("marco@gmail.fr");
         *         WebElement pass = driver.findElement(By.name("pass"));
         *         pass.sendKeys("admin123");
         *
         *
         *
         */
        



    }
}
