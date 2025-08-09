package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleWebAlert extends DriverSetup{

    @Test
    public void testWebAlert() throws InterruptedException {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");

        browser.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        Alert alert = browser.switchTo().alert();

        String text = alert.getText();
        System.out.println(text);
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);

        browser.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        text = alert.getText();
        System.out.println(text);
        Thread.sleep(3000);
        alert.dismiss();

        Thread.sleep(3000);

        browser.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        Thread.sleep(3000);
        System.out.println(alert.getText());
        alert.sendKeys("Hello QA");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);



    }
}
