package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    // preconditions: user should be logget out
    @BeforeMethod
    public void ensurePrecondition(){
        if (!isElementPresent(By.cssSelector("[href='/signup']"))) {
            wd.findElement(By.xpath("//a[contains(.,'logOut')]")).click();
            //sign up is not present
            //click on logout button
        }
    }

    @Test
    public void signUpTest(){
        wd.findElement(By.cssSelector("[href='/signup']")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
        wd.findElement(By.cssSelector("#first_name")).click();
        wd.findElement(By.cssSelector("#first_name")).clear();
        wd.findElement(By.cssSelector("#first_name")).sendKeys("Bober");
        wd.findElement(By.cssSelector("#second_name")).click();
        wd.findElement(By.cssSelector("#second_name")).clear();
        wd.findElement(By.cssSelector("#second_name")).sendKeys("Boberich");
        wd.findElement(By.cssSelector("#email")).click();
        wd.findElement(By.cssSelector("#email")).clear();
        wd.findElement(By.cssSelector("#email")).sendKeys("Boberich@bober.com");
        wd.findElement(By.cssSelector("#password")).click();
        wd.findElement(By.cssSelector("#password")).clear();
        wd.findElement(By.cssSelector("#password")).sendKeys("123456789Rfnz");
        wd.findElement(By.cssSelector("#check_policy")).click();

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
