package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    // preconditions: user should be logget out
    @BeforeMethod
    public void ensurePrecondition(){
        if (!isSignUpFormPresent()) {
            logout();
            //sign up is not present
            //click on logout button
        }
    }

    @Test
    public void signUpTest(){
        click(By.cssSelector("[href='/signup']"));
        isLoginFormPresent();
        type(By.cssSelector("#first_name"), "Boberka");
        type(By.cssSelector("#second_name"), "Boberichka");
        type(By.cssSelector("#email"), "Boberichka4@bober.com");
        type(By.cssSelector("#password"), "123456789Rfnz");
        click(By.cssSelector("#check_policy"));
        submit();
        Assert.assertTrue(isElementPresent(By.cssSelector("#root > div > header > section > ul > li:nth-child(5) > a")));


        // check локатор через chropath
        // id first_name
        // second_name
        //email
        //password
        //check_policy
    }

    // click on SignUp Button
    // fill in registration form
    // click on submit button
    //check login form displayed


}
