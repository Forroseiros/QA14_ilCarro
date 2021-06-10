package com.ilCarro.qa14.tests;

import com.ilCarro.qa14.tests.TestBase;
import org.testng.annotations.Test;

public class OpenHomePageTest extends TestBase {

    @Test
    public void homePageTest(){
        System.out.println("FindCarForm: " + app.car().isFindCarFormPresent());
//Main_mainpage__find_your_car__AHLkw
    }

}
