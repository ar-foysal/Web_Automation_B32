package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class hanldedifferentActions extends DriverSetup{

    @Test
    public void testDropdown() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice");

        Actions actions = new Actions(browser);
//
//        actions.scrollByAmount(0, 1000).build().perform();
//        Thread.sleep(2000);
//
//        actions.scrollByAmount(0, -1000).build().perform();
//        Thread.sleep(2000);

        WebElement mouse_hover = browser.findElement(By.xpath("//button[@id='mousehover']"));

        WebElement frame_example = browser.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));

        actions.scrollToElement(frame_example).build().perform();
        Thread.sleep(2000);

        actions.moveToElement(mouse_hover).build().perform();
        Thread.sleep(2000);

        actions.click(browser.findElement(By.xpath("//a[normalize-space()='Top']"))).build().perform();

//        browser.findElement(By.xpath("//a[normalize-space()='Top']")).click();
        Thread.sleep(2000);

        WebElement autocomplete = browser.findElement(By.xpath("//input[@id='autocomplete']"));

        actions.sendKeys(autocomplete,"Bangladesh").build().perform();

        Thread.sleep(2000);

        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(2000);

        actions.keyDown(Keys.CONTROL).sendKeys("x").build().perform();

        Thread.sleep(2000);
        WebElement name = browser.findElement(By.xpath("//input[@id='name']"));
        actions.click(name).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        Thread.sleep(5000);





    }
}
