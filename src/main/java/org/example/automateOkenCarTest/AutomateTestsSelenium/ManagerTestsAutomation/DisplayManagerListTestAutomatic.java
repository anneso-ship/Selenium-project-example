package org.example.automateOkenCarTest.AutomateTestsSelenium.ManagerTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DisplayManagerListTestAutomatic {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Accès à la page web
        driver.get("http://oken-cars.local/manager-list");

        //maximiser affichage ecran
        driver.manage().window().maximize();

    }
}
