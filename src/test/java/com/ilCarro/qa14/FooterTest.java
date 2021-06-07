package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTest extends TestBase {


    @Test
    public void goToFooter() {
        jumpToFooter();
    wd.findElement(By.cssSelector("#root > div > footer > section > div.footer__top_row > div.footer__top_row_logo > a > img")).click();

    }
    @Test
    public void goToFooter2(){
        jumpToFooter();
        Assert.assertTrue(isElementPresent(By.cssSelector("#root > div > footer > section > div.footer__low_row > div.footer__red_text")));

        wd.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.HOME);
    }
}


