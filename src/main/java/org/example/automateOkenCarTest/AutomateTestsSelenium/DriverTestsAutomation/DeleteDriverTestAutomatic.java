package org.example.automateOkenCarTest.AutomateTestsSelenium.DriverTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DeleteDriverTestAutomatic {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //maximiser affichage ecran
        driver.manage().window().maximize();

        driver.get("http://oken-cars.oken.lan/driver-list");

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));//Timer 25 secondes

        //Suppression d'un manager
        driver.findElement(By.xpath("/html/body/app-root/app-driver-list/div/table/tbody/tr/td[5]/div/div[3]/button")).click();

    }
}
