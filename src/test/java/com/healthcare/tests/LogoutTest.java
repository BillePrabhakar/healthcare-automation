package com.healthcare.tests;

import java.time.Duration;

import com.healthcare.base.BaseTest;
import com.healthcare.pages.HomePage;
import com.healthcare.pages.LoginPage;
import com.healthcare.utilities.LogUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    private static final Logger log = LogUtil.getLogger();

    @Test
    public void logoutTest() {

        log.info("========== LOGOUT TEST STARTED ==========");

        // Open CURA application
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        log.info("CURA application opened");

        // Click Make Appointment
        HomePage homePage = new HomePage(driver);
        homePage.clickMakeAppointment();
        log.info("Clicked Make Appointment");

        // Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("John Doe");
        log.info("Username entered");

        loginPage.enterPassword("ThisIsNotAPassword");
        log.info("Password entered");

        loginPage.clickLogin();
        log.info("User logged in successfully");

        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );

        // Open navigation menu
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("menu-toggle")
        )).click();

        log.info("Navigation menu opened");

        // Wait for Logout link
        WebDriver logoutLink = driver;

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.linkText("Logout")
        ));

        // Click Logout using JavaScript
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();",
                driver.findElement(By.linkText("Logout"))
        );

        log.info("Logout clicked");

        // Verify user is returned to home page
        wait.until(ExpectedConditions.urlToBe(
                "https://katalon-demo-cura.herokuapp.com/"
        ));

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://katalon-demo-cura.herokuapp.com/",
                "Logout was not successful"
        );

        log.info("Logout successful");
        log.info("========== LOGOUT TEST PASSED ==========");
    }
}