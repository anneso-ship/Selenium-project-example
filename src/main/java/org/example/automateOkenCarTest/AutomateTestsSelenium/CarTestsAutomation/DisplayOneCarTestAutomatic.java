package org.example.automateOkenCarTest.AutomateTestsSelenium.CarTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DisplayOneCarTestAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Attente avant bon remplissage
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(25));//Timer 25 secondes

        driver.get("http://oken-cars.local/car-list");

        //maximiser affichage ecran
        driver.manage().window().maximize();

        //Affichage d'un manager
        driver.findElement(By.xpath("//*[@id=\"viewButton\"]")).click();

    }
}