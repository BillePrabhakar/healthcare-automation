package com.healthcare.tests;

import java.time.Duration;

import com.healthcare.base.BaseTest;
import com.healthcare.pages.HomePage;
import com.healthcare.pages.LoginPage;
import com.healthcare.utilities.LogUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    private static final Logger log = LogUtil.getLogger();

    @Test
    public void invalidLoginTest() {

        log.info("========== INVALID LOGIN TEST STARTED ==========");

        // Open CURA application
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        log.info("CURA application opened");

        // Click Make Appointment
        HomePage homePage = new HomePage(driver);
        homePage.clickMakeAppointment();
        log.info("Clicked Make Appointment");

        // Enter invalid credentials
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("InvalidUser");
        log.info("Invalid username entered");

        loginPage.enterPassword("WrongPassword");
        log.info("Invalid password entered");

        loginPage.clickLogin();
        log.info("Login button clicked");

        // Wait for login error message
        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );

        String errorMessage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector(".text-danger")
                )
        ).getText();

        log.info("Login error message displayed: {}", errorMessage);

        // Verify error message
        Assert.assertTrue(
                errorMessage.contains("Login failed"),
                "Invalid login message was not displayed"
        );

        log.info("Invalid login validation successful");
        log.info("========== INVALID LOGIN TEST PASSED ==========");
    }
}