package com.globant;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class DeactivateUser_ESPN {
    public Logger log = Logger.getLogger(String.valueOf(AppTest.class));

    @BeforeTest
    public void launchBrowser() {
        log.info("Launch the browser");
        log.info("Open ESPN page: https://www.espnqa.com/?_adbock=true&src=com");
    }

    /**----- Test Case 3 ------ */
    @Test
    public void deactivateUser () {
        log.info("Log into ESPN page");
        log.info("Deactivate user");
    }

    @AfterTest
    public void closeBrowser() {
        log.info("Close ESPN page");
        log.info("Close the browser");
    }
}
