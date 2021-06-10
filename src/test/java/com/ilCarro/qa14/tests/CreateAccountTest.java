package com.ilCarro.qa14.tests;

import com.ilCarro.qa14.models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    // preconditions: user should be logget out
    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.user().isSignUpButtonPresent()) {
            app.user().logout();
            //sign up is not present
            //click on logout button
        }
    }

    @Test
    public void signUpTest(){
        app.header().clickOnSignupTab();
        app.user().isSignUpFormPresent();
        app.user().fillRegistrationForm(new User().withFirstName("Boberka").withSecondName("Boberichka").
                withEmail("Boberichka@bober.com").withPassword("123456789Rfnz"));
        app.user().clickCheckPolicy();
        app.user().submit();
        app.user().isLogInFormPresent();


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
