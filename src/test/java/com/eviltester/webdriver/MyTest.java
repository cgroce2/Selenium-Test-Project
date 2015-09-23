package com.eviltester.webdriver;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTest {

    @Test
    public void startWebDriver() {
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://rotoworld.com");
        Assert.assertTrue("title should start with Rotoworld Fantasy",
                driver.getTitle().startsWith("Rotoworld Fantasy"));
        driver.close();
        driver.quit();

    }

}
