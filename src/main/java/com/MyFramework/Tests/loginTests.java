package com.MyFramework.Tests;

import com.MyFramework.Tests.Base.TestBase;
import com.MyFramework.pages.loginPage;
import org.junit.Test;

public class loginTests extends TestBase

{ loginPage lp = new loginPage();
    @Test
    public void logins(){
       // System.out.println("testing");
       // driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//String userName;
//String passWord = "test";
       lp.login("Tester", "test");

    }
}
