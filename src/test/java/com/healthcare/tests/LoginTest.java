package com.healthcare.tests;

import com.healthcare.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyBrowserLaunch() {

        driver.get("https://www.google.com");

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);

        Assert.assertTrue(title.contains("Google"));
    }
}