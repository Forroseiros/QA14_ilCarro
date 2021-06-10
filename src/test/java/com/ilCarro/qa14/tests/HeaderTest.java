package com.ilCarro.qa14.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HeaderTest extends TestBase {
    WebDriver wd;

    @BeforeMethod
    public void SetUp() {
        wd = new ChromeDriver();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public boolean isFindCarFormPresent(By by) {
        return wd.findElements(by).size() > 0;
    }

    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    @Test
    public void SearchTest() {
        app.header().findSearchButton();
        app.header().isSearchTitlePresent();

    }

    @Test
    public void LetTheCatWorkTest() {
        app.header().findLetTheCatButton();
        app.car().isLetTheCatTitlePresent();
    }

    @Test
    public void TermsOfUseTest() {
        app.header().findTermsOfUseButton();
        app.header().isTermsOfUseTitlePresent();
    }

    @Test
    public void LogInTest(){
        app.header().findLoginButton();
        app.user().isLoginTitlePresent();
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
    }
}

