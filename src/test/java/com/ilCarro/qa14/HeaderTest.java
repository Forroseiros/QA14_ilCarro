package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HeaderTest {
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
        wd.findElement(By.cssSelector("div.container-full header.container-full:nth-child(1) section.container.header ul.header__nav.desktop:nth-child(2) li:nth-child(1) > a:nth-child(1)")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("#root > div > section > div.main-search__sidebar > div.search-sidebar__content")));

    }

    @Test
    public void LetTheCatWorkTest() {
        wd.findElement(By.cssSelector("#root > div > header > section > ul > li:nth-child(2) > a")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("#root > div > section > div.let-carwork-style_let_car__options__1vKeV")));
    }

    @Test
    public void TermsOfUseTest() {
        wd.findElement(By.cssSelector("#root > div > header > section > ul > li:nth-child(3) > a")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("#root > div")));
    }
    @Test
    public void LogInTest(){
        wd.findElement(By.cssSelector("#root > div > header > section > ul > li:nth-child(5) > a")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("#root > div > div:nth-child(2) > div > div.Login_login__right_block__1niYm")));
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
    }
}

