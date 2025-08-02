package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocateWebElement extends DriverSetup{
    @Test
    public void testLocateElement() throws InterruptedException {
        browser.get("https://www.google.com");
        WebElement searchInputBox;
//        searchInputBox = browser.findElement(By.id("APjFqb"));

//        searchInputBox =browser.findElement(By.name("q"));

//        searchInputBox = browser.findElement(By.className("gLFyf"));

//        searchInputBox = browser.findElement(By.tagName("textarea"));

//        searchInputBox = browser.findElement(By.cssSelector("textarea[name='q']"));

//        searchInputBox = browser.findElement(By.xpath("//textarea[@name='q']"));


//        searchInputBox = browser.findElement(By.cssSelector("textarea"));
//        searchInputBox = browser.findElement(By.xpath("//textarea"));

//        searchInputBox = browser.findElement(By.cssSelector("#APjFqb"));

        searchInputBox = browser.findElement(By.cssSelector(".gLFyf"));

        searchInputBox.sendKeys("QA");

        Thread.sleep(2000);

//        browser.findElement(By.linkText("Gmail")).click();
//
//        Thread.sleep(2000);
//
//        browser.navigate().back();
//
//        browser.findElement(By.partialLinkText("mages")).click();
//
//        Thread.sleep(5000);


       List<WebElement> all_links_elements = browser.findElements(By.xpath("//a"));


       for (WebElement link_element: all_links_elements){
           String text = link_element.getText();
           System.out.println(text);
       }


    }
}
