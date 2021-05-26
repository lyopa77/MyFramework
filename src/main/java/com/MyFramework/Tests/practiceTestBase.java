package com.MyFramework.Tests;

import com.MyFramework.Tests.Base.TestBase;
import com.MyFramework.utilities.BrowserUtils;
import com.MyFramework.utilities.Driver;
import com.MyFramework.utilities.WebDriverFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class practiceTestBase extends TestBase {
   // WebDriver driver;
  @Test
          public void getter(){

        driver.get("https://www.google.com/?gws_rd=ssl");
       WebElement query  = driver.findElement(By.name("q"));
       query.sendKeys("apples");
     driver.findElement(By.name("btnK")).click();
      System.out.println("clicked");


      BrowserUtils.wait(2);


}}
