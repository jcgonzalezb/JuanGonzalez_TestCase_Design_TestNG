package com.globant;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.logging.Logger;


public class AppTest
{
    public Logger log = Logger.getLogger(String.valueOf(AppTest.class));

    @BeforeSuite
    public void setUp() {
        log.info("Set up system properties for the browser");
        log.info("Have a valid ESPN account");
    }

    @BeforeMethod
    public void launchBrowser() {
        log.info("Launch the browser");
        log.info("Open ESPN page: https://www.espnqa.com/?_adbock=true&src=com");
    }

    /**----- Test Case 1 ------ */
    @Test
    public void logInto (){
        log.info("Log into ESPN page");
    }

    /**----- Test Case 2 ------ */
    @Test
    public void logOut(){
        log.info("Log into ESPN page");
        log.info("Log out of ESPN page");
    }

    /**----- Test Case 3 ------ */
    @Test
    public void deactivateUser () {
        log.info("Log into ESPN page");
        log.info("Deactivate user");
    }

    @AfterMethod
    public void closeBrowser() {
        log.info("Close ESPN page");
        log.info("Close the browser");
    }
}
