package org.example.automateOkenCarTest.AutomateTestsSelenium.DriverTestsAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayDriverListTestAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Accès à la page web
        driver.get("http://oken-cars.oken.lan/driver-list");

        //maximiser affichage ecran
        driver.manage().window().maximize();
    }
}
