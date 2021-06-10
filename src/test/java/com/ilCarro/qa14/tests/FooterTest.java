package com.ilCarro.qa14.tests;

import org.testng.annotations.Test;

public class FooterTest extends TestBase {


    @Test
    public void goToFooter() {
        app.footer().jumpToFooter();
        app.footer().findElementInTheFooter();

    }

    @Test
    public void goToFooter2(){
        app.footer().jumpToFooter();
      //  Assert.assertTrue(isElementPresent(By.cssSelector("#root > div > footer > section > div.footer__low_row > div.footer__red_text")));

        app.header().jumpToHeader();
    }

}


