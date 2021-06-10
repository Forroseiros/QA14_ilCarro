package com.ilCarro.qa14.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HeaderHelper extends HelperBase {
    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public void isSearchTitlePresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector("#root > div > section > div.main-search__sidebar > div.search-sidebar__content")));
    }

    public void findSearchButton() {
        click(By.cssSelector("div.container-full header.container-full:nth-child(1) section.container.header ul.header__nav.desktop:nth-child(2) li:nth-child(1) > a:nth-child(1)"));
    }

    public void findLetTheCatButton() {
        wd.findElement(By.cssSelector("#root > div > header > section > ul > li:nth-child(2) > a")).click();
    }

    public void isTermsOfUseTitlePresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector("#root > div")));
    }

    public void findTermsOfUseButton() {
        click(By.cssSelector("#root > div > header > section > ul > li:nth-child(3) > a"));
    }

    public void findLoginButton() {
        click(By.cssSelector("#root > div > header > section > ul > li:nth-child(5) > a"));
    }

    public void isLogoutTabPresent() {
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(.,'logOut')]")));
    }



    public void jumpToHeader() {
        wd.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.HOME);
    }

    public void clickOnSignupTab() {
        click(By.cssSelector("[href='/signup']"));
    }}
