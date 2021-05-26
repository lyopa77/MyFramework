package com.MyFramework.Tests;

import com.MyFramework.Tests.Base.TestBase;
import com.MyFramework.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import java.util.List;

public class BasicNavigation extends TestBase {
   // static WebDriver driver;
     public static void main(String[] args) throws InterruptedException {

WebDriver driver = WebDriverFactory.getDriver("edge");

        driver.get("http://practice.cybertekschool.com");
        driver.manage().window().maximize();

        WebElement addEl =  driver.findElement(By.partialLinkText(("Add/Remove Elements")));
        addEl.click();

       List <WebElement> addEl2 = driver.findElements(By.xpath("//*[@onclick = 'addElement()']"));




       for (int i=0; i <3;i++){

           for (WebElement each: addEl2){
               each.click();
               Thread.sleep(1000);
           }
       }

         List <WebElement> delete = driver.findElements(By.xpath("//*[@id=\"elements\"]/button"));
            //   System.out.println( addEl.getSize());

         // for (int j=0; j<3;j++){
             for (WebElement eachdel: delete){
                 System.out.println("Deleting element");
                   eachdel.click();
                   Thread.sleep(1000);
                   // System.out.println("number "+ j);
             }
        // }


        System.out.println("page title is: " + driver.getTitle());

        System.out.println("current url " + driver.getCurrentUrl());
        Thread.sleep(1000);


     }}

