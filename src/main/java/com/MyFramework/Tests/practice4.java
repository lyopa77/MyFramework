package com.MyFramework.Tests;

import com.MyFramework.utilities.WebDriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class practice4 {

    private static WebDriver driver;
    // drop = id("dropdown");
//    WebDriver driver ;
    //  private WebDriver;

@BeforeClass
            public static  void setup() throws InterruptedException {
     driver = WebDriverFactory.getDriver("chrome");
driver.manage().window().maximize();
Thread.sleep(1000);
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//driver.get("http://practice.cybertekschool.com/dropdown");
}

    @Test
    public  void dropdown() throws InterruptedException {

    //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
       driver.get("http://practice.cybertekschool.com/dropdown");
        Select drop = new Select(driver.findElement(By.id("dropdown")));

        System.out.println(drop.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        drop.selectByVisibleText("Option 1");
        Thread.sleep(1000);

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1977");
        Select mo = new Select(driver.findElement(By.id("month")));
        mo.selectByIndex(0);
        Thread.sleep(1000);
        List<WebElement> all  = mo.getAllSelectedOptions();
        for (WebElement alls:all){
            System.out.println("month " + alls.getText());}
       //  mo.selectByValue("2");
       // System.out.println(mo.getAllSelectedOptions());
Thread.sleep(1000);
        Select lan = new Select(driver.findElement(By.name("Languages")));
       List <WebElement> lans = lan.getOptions();
       for (WebElement langs: lans) System.out.println(langs.getText());
        Actions act = new Actions(driver);
        act.keyDown(Keys.SHIFT);
        lan.selectByIndex(0);
        lan.selectByIndex(1);
        lan.selectByIndex(2);
        Thread.sleep(3000);
        lan.deselectByIndex(0);
        Thread.sleep(2000);
        lan.deselectByIndex(1);
        Thread.sleep(2000);
        lan.deselectByIndex(2);
        act.keyUp(Keys.SHIFT);
    }

    @Test
            public void checkboxes () throws InterruptedException {
      //  WebDriver driver = WebDriverFactory.getDriver("chrome");
driver.get("http://practice.cybertekschool.com/checkboxes");
driver.manage().window().maximize();
   WebElement checkbox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
//WebElement checkbox1 = driver.findElement(By.xpath("//input[.='checkbox 1']"));

checkbox1.click();
     if (checkbox1.isSelected()){
            System.out.println("selected");} else {System.out.println("not selected");}
Thread.sleep(2000);
     }
 @Test
   // public static void main(String[] args) throws InterruptedException {
        public void autocomplete() throws InterruptedException {
   // WebDriver driver = WebDriverFactory.getDriver("edge");
    driver.get("http://practice.cybertekschool.com/autocomplete");
    Thread.sleep(1000);
    List<WebElement> list = driver.findElements(By.tagName("a"));
    for (WebElement eachlink : list) {
        System.out.println(eachlink.getText());
    }
    WebElement country = driver.findElement(By.id("myCountry"));
    country.sendKeys("z");
    Thread.sleep(1000);
    // WebElement cName =  driver.findElement(By.cssSelector("input[type = 'hidden'/[2]]"));
    // System.out.println( cName.getAttribute("value"));
    List<WebElement> cName = driver.findElements(By.cssSelector("input[type = 'hidden']"));
    for (WebElement names : cName) {
        System.out.println("country name " + names.getAttribute("value"));
    }}
    //System.out.println(list.size());}
@AfterClass
        public static void close (){
        driver.quit();
     }

}
