package org.example.automateOkenCarTest.AutomateTestsSelenium.OwnerTestsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DeleteOwnerTestAutomatic {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //maximiser affichage ecran
        driver.manage().window().maximize();

        driver.get("http://oken-cars.local/owner-list");

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));//Timer 25 secondes

        //Suppression d'un owner
        driver.findElement(By.xpath("/html/body/app-root/app-owner-list/div/table/tbody/tr[3]/td[5]/div/div[3]/button")).click();

    }
}
