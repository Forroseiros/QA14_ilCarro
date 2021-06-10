package com.ilCarro.qa14.fw;

import com.ilCarro.qa14.fw.HelperBase;
import com.ilCarro.qa14.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void isLoginTitlePresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector("#root > div > div:nth-child(2) > div > div.Login_login__right_block__1niYm")));
    }

    public void logout() {
        click(By.xpath("//a[contains(.,'logOut')]"));
    }

    public boolean isSignUpButtonPresent() {
        return isElementPresent(By.cssSelector("[href='/signup']"));
    }

    public void isSignUpFormPresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
    }

    public void submit() {
        click(By.cssSelector("[type='submit']"));
    }

    public void fillLoginForm(User user) {
        type(By.cssSelector("[name='email'] "), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

    public void logIn() {
        clickOnLoginTub();
        type(By.cssSelector("[name='email'] "),"Boberichka6@bober.com");
        type(By.name("password"),"123456789Rfnz");
        submit();
    }

    public boolean isUserLoggedIn() {
        return isFindCarFormPresent(By.xpath("//a[contains(.,'logOut')]"));
    }

    public void isLogInFormPresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector("#root > div > header > section > ul > li:nth-child(5) > a")));
    }

    public void clickCheckPolicy() {
        click(By.cssSelector("#check_policy"));
    }

    public void fillRegistrationForm(User user) {
        type(By.cssSelector("#first_name"), user.getFirstName());
        type(By.cssSelector("#second_name"), user.getSecondName());
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#password"), user.getPassword());
    }
    public void clickOnLoginTub() {
        click(By.cssSelector("#root > div > header > section > ul > li:nth-child(5) > a"));
    }

}
