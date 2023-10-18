package org.example.exos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Exercice7 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.fr");

        //Simuler le clic sur la touche "Entrer" du clavier
        driver.findElement(By.cssSelector("#L2AGLb > div:nth-child(1)")).click();
        driver.findElement(By.name("q")).sendKeys("mercedes" + Keys.ENTER);

        Thread.sleep(200);

        //Réaliser un ctrl A ( séléctionner toute la page) simulation action du clavier
        Actions actionProvider = new Actions(driver);
        Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
        keydown.perform();

        Thread.sleep(200);

        /*WebElement searchbox = driver.findElement(By.name("q"));
        actionProvider.keyDown(Keys.SHIFT).sendKeys(searchbox, "lamborghini").
                keyUp(Keys.SHIFT).sendKeys("mercedes").perform();*/

    }
}
