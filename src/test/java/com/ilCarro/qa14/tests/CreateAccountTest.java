package com.ilCarro.qa14.tests;

import com.ilCarro.qa14.models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateAccountTest extends TestBase {



    // preconditions: user should be logget out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.user().isSignUpButtonPresent()) {
            app.user().logout();
            //sign up is not present
            //click on logout button
        }
    }

    @Test
    public void signUpTest() {
        app.header().clickOnSignupTab();
        app.user().isSignUpFormPresent();
        app.user().fillRegistrationForm(new User().withFirstName("Boberka").withSecondName("Boberichka").
                withEmail("Boberichka" + System.currentTimeMillis() + "@bober.com").withPassword("123456789Rfnz"));
        app.user().clickCheckPolicy();
        app.user().submit();
        app.user().isLogInFormPresent();
    }

    @Test(dataProvider = "validUser",dataProviderClass = DataProviders.class)
    public void signUpFromDataProviderTest(String fName, String sName, String email, String password) {
        app.header().clickOnSignupTab();
        app.user().isSignUpFormPresent();
        app.user().fillRegistrationForm(new User()
                .withFirstName(fName)
                .withSecondName(sName)
                .withEmail(email)
                .withPassword(password));
        app.user().clickCheckPolicy();
        app.user().submit();
        logger.info("Login form present. Actual result: " + app.user().isLoginFormPresent()
                + ".Expected result: true.");
        app.user().isLogInFormPresent();

    }@Test(dataProvider = "validUserFromCSV", dataProviderClass = DataProviders.class)
    public void signUpFromDataProviderFromCSVTest(User user) {
        app.header().clickOnSignupTab();
        app.user().isSignUpFormPresent();
        app.user().fillRegistrationForm(user);
        app.user().clickCheckPolicy();
        app.user().submit();
        logger.info("Login form present. Actual result: " + app.user().isLoginFormPresent()
                + ".Expected result: true.");
        app.user().isLogInFormPresent();

    }
        // check локатор через chropath
        // id first_name
        // second_name
        //email
        //password
        //check_policy


    // click on SignUp Button
    // fill in registration form
    // click on submit button
    //check login form displayed


}
