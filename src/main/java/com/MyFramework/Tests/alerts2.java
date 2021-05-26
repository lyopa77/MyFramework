package com.MyFramework.Tests;

import com.MyFramework.utilities.BrowserUtils;
import com.MyFramework.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class alerts2 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
   @Test
    public void alert() throws InterruptedException {
       WebElement jsalert = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]"));
       jsalert.click();
       Thread.sleep(1000);
       Alert alert = driver.switchTo().alert();
       BrowserUtils.wait(2);
       alert.dismiss();
      Thread.sleep(1000);
      WebElement result = driver.findElement(By.id("result"));
       System.out.println(result.getText());
   }


    @Test
    public void confirm() throws InterruptedException {
        WebElement jsconfirm = driver.findElement(By.xpath("//button[@onclick = 'jsConfirm()']"));
        Thread.sleep(2000);
        jsconfirm.click();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        Thread.sleep(2000);
        WebElement result2 = driver.findElement(By.id("result"));
        System.out.println(result2.getText());
    }
    @Test
    public void prompt() throws InterruptedException {
        WebElement jsprompt = driver.findElement(By.xpath("//button[@onclick = 'jsPrompt()']"));
        Thread.sleep(2000);
        jsprompt.click();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("well then");
        Thread.sleep(2000);
        alert2.accept();
        WebElement result2 = driver.findElement(By.id("result"));
        System.out.println(result2.getText());
    }


@AfterMethod
    public void close(){
        driver.quit();
}
}
