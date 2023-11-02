package org.example.automateOkenCarTest.AutomateTestsSelenium.CustomerTestsAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayCustomerListTestAutomatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Accès à la page web
        driver.get("http://oken-cars.oken.lan/customer-list");

        //maximiser affichage ecran
        driver.manage().window().maximize();
    }
}
