package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        // go to logintest
        // if user logged in, click logout, go to log in
        if (!isSignUpFormPresent()) {
            logout();
        }
    }


    @Test
    public void loginRegisteredUserPositiveTest() {
        // go to login page
        click(By.cssSelector("#root > div > header > section > ul > li:nth-child(5) > a"));

        //fill login form in
        type(By.cssSelector("[name='email'] "), "Boberichka@bober.com");
        type(By.name("password"), "123456789Rfnz");
        // press submit login
        submit();
        isLogoutTabPresent();



        //assert user logged in
    }

}
