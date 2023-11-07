package org.example.automateOkenCarTest.AutomateTestsSelenium.CarTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DeleteCarTestAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //maximiser affichage ecran
        driver.manage().window().maximize();

        driver.get("http://oken-cars.local/car-list");

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));//Timer 25 secondes

        //Suppression d'un manager
        driver.findElement(By.xpath("//*[@id=\"deleteButton\"]")).click();

    }
}
 