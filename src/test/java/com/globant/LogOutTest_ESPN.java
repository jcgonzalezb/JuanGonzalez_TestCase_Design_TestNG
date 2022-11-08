package com.globant;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class LogOutTest_ESPN {
    public Logger log = Logger.getLogger(String.valueOf(AppTest.class));

    @BeforeTest
    public void launchBrowser() {
        log.info("Launch the browser");
        log.info("Open ESPN page: https://www.espnqa.com/?_adbock=true&src=com");
    }

    /**----- Test Case 2 ------ */
    @Test
    public void logOut(){
        log.info("Log into ESPN page");
        log.info("Log out of ESPN page");
    }

    @AfterTest
    public void closeBrowser() {
        log.info("Close ESPN page");
        log.info("Close the browser");
    }
}
