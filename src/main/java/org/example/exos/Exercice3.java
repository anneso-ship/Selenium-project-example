package org.example.exos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Position;
import java.io.File;
import java.io.IOException;

public class Exercice3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://aliexpress.com");

        //récupération position d'une page web
        Point position = driver.manage().window().getPosition();
        System.out.println(position);
        //Les dimensions de la position de la fenètre
        position.getX();//abscisse
        position.getY();//ordonnée

        //forcer position
        driver.manage().window().setPosition(new Point(200,350));



    }
}
