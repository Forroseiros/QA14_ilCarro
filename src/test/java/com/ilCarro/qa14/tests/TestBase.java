package com.ilCarro.qa14.tests;

import com.ilCarro.qa14.fw.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeSuite
    public void setUp() {

        app.init();

    }

    @BeforeMethod
    public void startTest(Method m, Object[] p) {
        logger.info("Start test " + m.getName() + "with data:" + Arrays.asList(p));
        logger.info("______________________________");
    }

    @AfterSuite(enabled = false)
    public void tearDown() {
        app.stop();


    }

    @AfterMethod(alwaysRun = true)
    public void stopTest(ITestResult result) {
        if (result.isSuccess()) {
            logger.info("Passed: test method " + result.getMethod().getMethodName());

        } else {
            logger.error("FAILED: Test method " + result.getMethod().getMethodName() + "\n" +

            "Svreenshot:" + app.user().takeScreenshot());
        }
    }


}
