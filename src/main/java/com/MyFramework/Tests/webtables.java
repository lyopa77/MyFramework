package com.MyFramework.Tests;

import com.MyFramework.Tests.Base.TestBase;
import com.MyFramework.utilities.WebDriverFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class webtables {
   static  WebDriver driver;
    @Test
    public void verify_date () {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        WebElement user = driver.findElement(By.id("ctl00_MainContent_username"));
        user.sendKeys("Tester");
        WebElement pass = driver.findElement(By.id("ctl00_MainContent_password"));
        pass.sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement sod = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[5]"));
        String expDate = "01/05/2010";
        String actualDate = sod.getText();
        System.out.println("exp date " + expDate);
        Assert.assertEquals(actualDate, expDate, "not equal");
        Assert.assertEquals(actualDate, expDate, "def not equal");
       // Assert.fail("I am failing");

    }
@After
    public  void close (){
        driver.quit();
    }


}
