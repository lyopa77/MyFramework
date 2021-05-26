package com.MyFramework.Tests;

import com.MyFramework.utilities.WebDriverFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.PortUnreachableException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class iframes2 {

        @FindBy (xpath = "//*[@id=\"mceu_34\"]/button")
        public WebElement iframe;
    @FindBy (partialLinkText = "Here")
           public WebElement clickb;
    public iframes2(){
        PageFactory.initElements(driver, this);}

WebDriver driver;
@Before
    public void  setup() {
   driver =  WebDriverFactory.getDriver("edge");
     //driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    driver.get("http://practice.cybertekschool.com/iframe");

}
@Test
    public void open() throws InterruptedException {

   // WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
    driver.switchTo().frame(iframe);
    WebElement button = driver.findElement(By.xpath("//*[@id=\"mceu_34\"]/button"));
   // button.click();
    Alert alert = driver.switchTo().alert();
    Thread.sleep(2000);
    alert.accept();
    WebElement content = driver.findElement(By.xpath("//p"));
    Assert.assertTrue(content.isDisplayed());
    content.clear();
    Thread.sleep(2000);
    content.sendKeys("hello");
Thread.sleep(2000);
    System.out.println(content.getText());}

    @Test
            public void windowHandles() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/windows");
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String mainhandle = driver.getWindowHandle();
        System.out.println("windowH1 " + mainhandle);
     //WebElement clickb = driver.findElement(By.partialLinkText("Here"));
for (int i = 0; i<=1;i++){
clickb.click();
Thread.sleep(2000);}

/* String titleAfterClick = driver.getTitle();
        System.out.println("title after click "+ titleAfterClick);
String handle = driver.getWindowHandle();
        System.out.println("windowH "+ handle);*/


Set<String> whandles=  driver.getWindowHandles();
for (String each: whandles){
    driver.switchTo().window(each);
    System.out.println(driver.getTitle());
    System.out.println(driver.getWindowHandle());
    System.out.println(driver.getCurrentUrl());;
}
driver.switchTo().window(mainhandle);
Thread.sleep(2000);
        System.out.println("last window "+ driver.getTitle());
        System.out.println("last url "+ driver.getCurrentUrl());

    }
@Test

@After
    public void close()
{driver.quit();}
}
