package org.example.exos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercice1 {
    public static void main(String[] args) {
        /******************
         *
         * Ouverture des pages web automatiquement ,
         accépter automatiquement cookies et fermeture des pages
         ************/


        //Ouverture automatique d'une page web etsy
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//récupération du fichier chrome driver , pour ouverture du navigateiur
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = new ChromeDriver();
        driver1.get("http://www.amazon.fr/"); //accès à la page web ( ouverture) METHODE 1
        driver2.navigate().to("http://www.etsy.fr/"); //accès à la page web ( ouverture) METHODE 2
        System.out.println(driver1.getTitle());//Récuperer titre du site
        System.out.println(driver2.getTitle());

        //Accépter cookie
        driver1.findElement(By.cssSelector("#a-autoid-0")).click();//Simuler click sur le boutton "accépter les cookies"

        //driver.close(); //fermeture du navigateur cloture navigateur (uniquemet la fenetre)
    }
}
