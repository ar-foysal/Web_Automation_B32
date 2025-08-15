package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleFrameElement extends DriverSetup{
    @Test
    public void testFrameContent() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice");

        Actions actions = new Actions(browser);

        actions.scrollByAmount(0, 1000).build().perform();

        Thread.sleep(2000);

//        browser.switchTo().frame("courses-iframe");

//        browser.switchTo().frame("iframe-name");

//        browser.switchTo().frame(0);

        WebElement frame_element = browser.findElement(By.xpath("//iframe[@id='courses-iframe']"));

        browser.switchTo().frame(frame_element);

        WebElement email = browser.findElement(By.xpath("//li[normalize-space()='contact@rahulshettyacademy.com']"));

        System.out.println(email.getText());

        browser.switchTo().defaultContent();
        WebElement el = browser.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));
        System.out.println(el.getText());
    }
}
