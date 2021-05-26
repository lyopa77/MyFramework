package com.MyFramework.pages;

import com.MyFramework.utilities.BrowserUtils;
import com.MyFramework.utilities.Driver;
import com.MyFramework.utilities.WebDriverFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class loginPage {
    WebDriver driver;

    @FindBy(id="ctl00_MainContent_username")
               public WebElement usernameel;

    @FindBy(id= "ctl00_MainContent_password")
    public WebElement passwordel;
    @FindBy(id= "ctl00_MainContent_login_button")
    public WebElement loginBtn;

    public loginPage(){
        PageFactory.initElements(driver,this);
    }

   /* WebElement usernameel = driver.findElement(By.id("ctl00_MainContent_username"));
    WebElement passwordel = driver.findElement(By.id("ctl00_MainContent_password"));
    WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button")); */



    public void login(String username, String password){


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        System.out.println("opening2");
BrowserUtils.wait(2000);
        usernameel.sendKeys(username);
     BrowserUtils.wait(1000);
        passwordel.sendKeys(password);
        BrowserUtils.wait(1000);
        loginBtn.click();
}

}
