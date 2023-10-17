package org.example.exos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercice4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Acceder à la page web
        driver.get("https:youtube.com");

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Accepter cookie
        driver.findElement(By.cssSelector("#content > div.body.style-scope.ytd-consent-bump-v2-lightbox > div.eom-buttons.style-scope.ytd-consent-bump-v2-lightbox > div:nth-child(1) > ytd-button-renderer:nth-child(2)")).click();//Simuler click sur le boutton "accépter les cookies"

        //Selectionner un element web et effectuer une action: ici on automatise le remplissage d'un champ
        driver.findElement(By.name("search_query")).sendKeys("putch au Mali");//Remplissage automatique de la barre de recherche
        driver.findElement(By.name("search_query")).submit(); //Cliquer sur le boutton pour lancer la recherche
        //driver.findElement(By.id("search")).sendKeys("sac en perles fait main");

    }
}
