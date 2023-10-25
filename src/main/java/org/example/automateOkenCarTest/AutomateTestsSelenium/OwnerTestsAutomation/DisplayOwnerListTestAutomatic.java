package org.example.automateOkenCarTest.AutomateTestsSelenium.OwnerTestsAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DisplayOwnerListTestAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Attente avant bon remplissage
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(25));//Timer 25 secondes

        driver.get("http://oken-cars.local/owner-list");

        //maximiser affichage ecran
        driver.manage().window().maximize();
    }
}
