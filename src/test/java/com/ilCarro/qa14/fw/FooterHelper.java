package com.ilCarro.qa14.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FooterHelper extends HelperBase {
    public FooterHelper(WebDriver wd) {
        super(wd);
    }

    public void jumpToFooter(){
        wd.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.END);
    }

    public void findElementInTheFooter() {
        click(By.cssSelector("#root > div > footer > section > div.footer__top_row > div.footer__top_row_logo > a > img"));
    }
}
