package com.MyFramework.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practices {

    private static WebDriver dr;
    static class Shape{
       void run (){
        System.out.println("shape");}
    }
    static class Circle extends Shape {
        void run(){
            System.out.println("circle");
        }

        public static  void main(String[] args) {
            Shape b = new Circle();
            b.run();
        }
    }}

  /*  public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        dr = new ChromeDriver();
        dr.navigate().to("http://practice.cybertekschool.com/registration_form");
        dr.findElement(By.cssSelector("input[name=\"firstname\"]")).sendKeys("lyopa");
        dr.findElement(By.cssSelector("input[name='lastname']")).sendKeys("vines");
        dr.findElement(By.cssSelector("input[value = \"female\"]")).click();
        Thread.sleep(1500);
        dr.findElement(By.cssSelector("input[value = \"other\"]")).click();
        Thread.sleep(1500);
        dr.findElement(By.xpath("//input [@name = 'birthday']")).sendKeys("08/08/2020");
        Thread.sleep(1500);
        WebElement msg = dr.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/small[2]"));
        System.out.println(msg.getText());
        Select selectMO = new Select(dr.findElement(By.xpath("//select[@name = 'department']")));
        selectMO.selectByVisibleText("Mayor's Office");     selectMO.selectByVisibleText("MCR");

*/




