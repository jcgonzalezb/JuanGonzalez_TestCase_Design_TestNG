package com.globant;

import org.testng.annotations.*;

import java.util.logging.Logger;


public class AppTest {
    public Logger log = Logger.getLogger(String.valueOf(AppTest.class));

    @BeforeSuite
    public void setUp() {
        log.info("Have a valid ESPN account");
        log.info("Set up system properties for the browser");
    }
}
