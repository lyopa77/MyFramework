package com.MyFramework.Tests;

import com.MyFramework.Tests.Base.TestBase;
import com.MyFramework.utilities.BrowserUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class hovers extends TestBase {
   // WebDriver driver;
    @Test
    public void ass(){
        Assert.assertEquals(1,1);
    }
    @Test
            public void hovering(){
    driver.get("http://practice.cybertekschool.com/hovers");
        System.out.println("hovering");
        BrowserUtils.wait(2);
       WebElement img1 =  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
       WebElement user1 = driver.findElement(By.xpath("//*[.='name: user1']"));
        Actions act = new Actions(driver);
        act.moveToElement(img1).perform();
        BrowserUtils.wait(4);
        Assert.assertTrue(user1.isDisplayed());

}
@Test
    public void forms(){

        driver.get("http://practice.cybertekschool.com/upload");
    String path ="C:\\Users\\lyopa\\OneDrive\\Desktop\\screenshots.jpg";
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys(path);
        BrowserUtils.wait(2);
        WebElement subm = driver.findElement(By.id("file-submit"));
        BrowserUtils.wait(2);
        subm.click();
        BrowserUtils.wait(2);
        WebElement up = driver.findElement(By.id("uploaded-files"));
        WebElement up1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
Assert.assertEquals(up1.getText(),"File Uploaded!");
    System.out.println( up.getText());
    System.out.println(up1.getText());


}
}
