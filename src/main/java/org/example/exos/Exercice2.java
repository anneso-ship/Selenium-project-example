package org.example.exos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercice2 {
    public static void main(String[] args) {
        /*********Tester avec firefox*********
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https:netflix.com");
        driver.navigate().refresh();

        //driver.quit();//ferme toutes fenetre

        //maximiser affichage ecran
        driver.manage().window().maximize();
        //mininmiser affichage ecran
        driver.manage().window().minimize();
        //Mettre en plein ecran
        driver.manage().window().fullscreen();
        //Dimension manuel de l'ecran
        Dimension size = driver.manage().window().getSize();
      //  driver.manage().window().setSize(new Dimension(900,500));
        //Affichage dimensions de notre page web
        System.out.println("Largeur : "+driver.manage().window().getSize().getWidth());
        System.out.println("Hauteur : "+driver.manage().window().getSize().getHeight());
        System.out.println("Taille : "+size);
    }
}
