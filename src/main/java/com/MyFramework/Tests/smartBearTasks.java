package com.MyFramework.Tests;

import com.MyFramework.utilities.SmartBearUtilities;
import com.MyFramework.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class smartBearTasks
{
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtilities.loginToSmartBear(driver);
    }
    @Test
    public void links(){
        List <WebElement> all = driver.findElements(By.xpath("//body//a"));
        System.out.println(all.size());
        for (WebElement each:all){
            System.out.println(each.getText());
        }
    }


    @AfterClass
    public void close(){
        driver.quit();
    }
}
