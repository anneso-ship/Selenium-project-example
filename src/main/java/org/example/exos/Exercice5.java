package org.example.exos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercice5 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Acceder à la page web
        driver.get("https://google.com");

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Accepter cookie
        driver.findElement(By.cssSelector("#L2AGLb > div")).click();//Simuler click sur le boutton "accépter les cookies"

        //Selectionner un element web et effectuer une action: ici on automatise le remplissage d'un champ
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("PUTCH AU BURKINA");//Remplissage automatique de la barre de recherche
        search.submit(); //Cliquer sur le boutton pour lancer la recherche



    }
}
