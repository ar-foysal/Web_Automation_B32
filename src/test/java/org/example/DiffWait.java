package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DiffWait extends DriverSetup{

    @Test
    public void testDelayElement() throws InterruptedException {
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browser.get("https://qavbox.github.io/demo/delay");

        browser.findElement(By.xpath("//input[@name='commit1']")).click();
//        Thread.sleep(10000);
        WebElement text_el =browser.findElement(By.xpath("//h2[@id='delay']"));
        System.out.println(text_el.getText());
        browser.findElement(By.xpath("//input[@name='commit']")).click();

        WebElement text2 = browser.findElement(By.xpath("//h2[@id='two']"));

        WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(10));

        wait.until(ExpectedConditions.textToBePresentInElement(text2, "I am here!"));

        System.out.println(text2.getText());
    }
}
