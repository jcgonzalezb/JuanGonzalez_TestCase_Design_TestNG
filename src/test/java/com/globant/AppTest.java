package com.globant;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest
{

    @BeforeSuite
    public void setUp() {
        System.out.println("Set up system properties for the browser");
        System.out.println("Have a valid ESPN account");
    }

    @BeforeMethod
    public void launchBrowser() {
        System.out.println("Launch the browser");
        System.out.println("Open ESPN page: https://www.espnqa.com/?_adbock=true&src=com");
    }

    /**----- Test Case 1 ------ */
    @Test
    public void logInto (){
        System.out.println("Log into ESPN page");
    }

    /**----- Test Case 2 ------ */
    @Test
    public void logOut(){
        System.out.println("Log out of ESPN page");
    }

    /**----- Test Case 3 ------ */
    @Test
    public void deactivateUser (){
        System.out.println("Deactivate user");
    }

    @AfterMethod
    public void closeBrowser() {
        System.out.println("Close ESPN page");
        System.out.println("Close the browser");
    }



}
