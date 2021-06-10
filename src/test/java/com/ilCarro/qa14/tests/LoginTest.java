package com.ilCarro.qa14.tests;

import com.ilCarro.qa14.models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        // go to logintest
        // if user logged in, click logout, go to log in
        if (!app.user().isSignUpButtonPresent()) {
            app.user().logout();
        }
    }


    @Test
    public void loginRegisteredUserPositiveTest() {
        // go to login page
        app.user().clickOnLoginTub();

        //fill login form in
        app.user().fillLoginForm(new User().withEmail("Boberichka6@bober.com").withPassword("123456789Rfnz"));
        // press submit login
        app.user().submit();
        app.header().isLogoutTabPresent();


        //assert user logged in
    }

    @Test
    public void loginRegisteredUserWithWrongPasswordNegativeTest() {
        // go to login page
        app.user().clickOnLoginTub();

        //fill login form in
        app.user().fillLoginForm(new User().withEmail("Boberichka6@bober.com").withPassword("1234567779Rfnz"));
        // press submit login
        app.user().submit();



    }
}
