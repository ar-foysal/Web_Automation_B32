package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class AppTest extends DriverSetup {


    @Test
    public void testGooglePageTitle() {
        // Load "https://www.google.com" webpage
        browser.get("https://www.google.com");

        // Get page title
        String pageTitle = browser.getTitle();

        // Validate title with text "Google"
        Assert.assertEquals(pageTitle, "Google");

    }

    @Test
    public void testGooglePageURL() {
        // Load "https://www.google.com" webpage
        browser.get("https://www.google.com");

        // Get page title
        String pageUrl = browser.getCurrentUrl();

        // Validate title with text "Google"
        Assert.assertEquals(pageUrl, "https://www.google.com/");

    }


}
