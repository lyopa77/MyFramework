package com.MyFramework.Tests;

import com.MyFramework.utilities.WebDriverFactory;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropdowns {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

}

@Test
    public void years(){
    Select yeardrop = new Select(driver.findElement(By.id("year")));
    int  expYear = LocalDate.now().getYear();
    System.out.println("exp year = "+ expYear);
    String  actval = yeardrop.getFirstSelectedOption().getText();
    actval.toCharArray();
   // Assert.assertEquals(expYear, actval );
    List <WebElement> years = yeardrop.getOptions();
    List <String> texts = new ArrayList<>();
    for (WebElement each: years){
        texts.add(each.getText()); }
    System.out.println(texts);
//driver.quit();
}
@Test
    public void days(){
        Select days = new Select(driver.findElement(By.id("day")));
        int expday =  LocalDate.now().getDayOfMonth();
    System.out.println("exp day "+ expday);
    System.out.println("Actual day "+ days.getFirstSelectedOption().getText());
    List <WebElement> alldays = days.getOptions();
   List <String> texts2 = new ArrayList<>();
   for (WebElement each: alldays){
       texts2.add(each.getText());
   }
    System.out.println(texts2);

}
@Test
        public void testing() throws InterruptedException {
driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
    Thread.sleep(1000);
    }
@AfterClass
    public void close (){
        driver.quit();
}
}
