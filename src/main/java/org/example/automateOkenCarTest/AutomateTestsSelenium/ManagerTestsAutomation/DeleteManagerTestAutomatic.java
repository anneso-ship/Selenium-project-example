package org.example.automateOkenCarTest.AutomateTestsSelenium.ManagerTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DeleteManagerTestAutomatic {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //maximiser affichage ecran
        driver.manage().window().maximize();

        driver.get("http://oken-cars.oken.lan/manager-list");

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));//Timer 25 secondes

        //Suppression d'un manager
        driver.findElement(By.xpath("//*[@id=\"deleteButton\"]")).click();

    }
}
