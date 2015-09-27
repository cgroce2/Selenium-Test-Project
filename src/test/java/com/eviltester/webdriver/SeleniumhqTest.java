package com.eviltester.webdriver;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by cgroce on 9/17/15.
 */

public class SeleniumhqTest {
//Test to load the seleniumhq.org site, click the Download tab and verify the Downloads page title says "Downloads"
    @Test
    public void seleniumhqFF() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://seleniumhq.org");

        WebElement downloadtab = driver.findElement(By.cssSelector("#menu_download a"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(downloadtab));
        downloadtab.click();
        org.junit.Assert.assertEquals("Downloads", driver.getTitle());

        //WebElement downloadtab = driver.findElement(By.id("menu_download"));
        //WebElement downloadlink = downloadtab.findElement(By.tagName("a"));
        //downloadlink.click();

        //driver.close();
        driver.quit();
    }
}




