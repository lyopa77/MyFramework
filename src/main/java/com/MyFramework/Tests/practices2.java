package com.MyFramework.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class practices2 {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/registration_form");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());;
        driver.manage().window().maximize();

            driver.findElement(By.cssSelector("input[name=\"firstname\"]")).sendKeys("lyopa");
            Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("vines");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value = \"female\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value = \"other\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input [@name = 'birthday']")).sendKeys("08/08/2020");
        JavascriptExecutor js =  (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        WebElement msg = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/small[2]"));
        System.out.println(msg.getText());
        Select selectMO = new Select(driver.findElement(By.xpath("//select[@name = 'department']")));
        Thread.sleep(2000);
        selectMO.selectByVisibleText("Mayor's Office");


        Thread.sleep(2000);
        selectMO.selectByVisibleText("MCR");
        Select seljob = new Select(driver.findElement(By.xpath("//select[@name = 'job_title']")));
        seljob.selectByVisibleText("SDET");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("input#inlineCheckbox2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(1000);

        List <WebElement> els = driver.findElements(By.tagName("div"));
        System.out.println(els.size());

      driver.quit();




    }
}
