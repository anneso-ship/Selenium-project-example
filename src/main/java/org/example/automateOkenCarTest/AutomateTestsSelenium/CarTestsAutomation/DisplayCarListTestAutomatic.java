package org.example.automateOkenCarTest.AutomateTestsSelenium.CarTestsAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayCarListTestAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Accès à la page web
        driver.get("http://oken-cars.local/car-list");

        //maximiser affichage ecran
        driver.manage().window().maximize();
    }
}
