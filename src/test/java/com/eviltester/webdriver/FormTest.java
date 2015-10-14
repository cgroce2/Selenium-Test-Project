package com.eviltester.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormTest {
    //This test navigates to the Forms page and clicks "Add Form"
    @Test
    public void startWebDriver() {
        WebDriver driver = new FirefoxDriver();
        //navigate to logon and enter engineer account credentials
        driver.navigate().to("https://app.dev.pardot.com/");
        driver.findElement(By.id("email_address")).sendKeys("engineer@pardot.com");
        driver.findElement(By.id("password")).sendKeys("pardot07");
        driver.findElement(By.name("commit")).click();

        driver.findElement(By.id("mark-tog")).click();
        driver.findElement(By.partialLinkText("Forms")).click();
        driver.findElement(By.partialLinkText("Add Form")).click();

        driver.close();
    }
}
