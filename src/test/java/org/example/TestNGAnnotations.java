package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNGAnnotations {

    @Test(priority = 0)
    public void testCase2() {
        System.out.println("This is the A Normal Test Case 2");
    }

    @Test(priority = 1)
    public void testCase1() {
        System.out.println("This is the A Normal Test Case 1");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will execute after every Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will execute after the Test Suite");
    }

    @Test
    public void testAssertion(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");


        // Get page title
        String pageTitle = driver.getTitle();

        // Validate title with text "Google"
        Assert.assertEquals(pageTitle, "Google");
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        System.out.println("Test 1");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(pageTitle, "Google");

        softAssert.assertTrue(true);
        softAssert.assertFalse(false);
        System.out.println("Test 2");


        softAssert.assertAll();
    }

}

