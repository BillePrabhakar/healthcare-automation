package com.healthcare.tests;

import java.time.Duration;

import com.healthcare.base.BaseTest;
import com.healthcare.pages.AppointmentPage;
import com.healthcare.pages.HomePage;
import com.healthcare.pages.LoginPage;
import com.healthcare.utilities.LogUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppointmentTest extends BaseTest {

    private static final Logger log =
            LogUtil.getLogger();

    @Test
    public void bookAppointmentTest() {

        log.info(
                "========== BOOK APPOINTMENT TEST STARTED =========="
        );

        driver.get(
                "https://katalon-demo-cura.herokuapp.com/"
        );

        log.info("CURA application opened");

        HomePage homePage =
                new HomePage(driver);

        homePage.clickMakeAppointment();

        log.info("Clicked Make Appointment");

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.enterUsername("John Doe");

        log.info("Username entered");

        loginPage.enterPassword(
                "ThisIsNotAPassword"
        );

        log.info("Password entered");

        loginPage.clickLogin();

        log.info("User logged in successfully");

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(10)
                );

        // Verify appointment page
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("combo_facility")
                )
        );

        AppointmentPage appointmentPage =
                new AppointmentPage(driver);

        appointmentPage.fillAppointment();

        log.info("Appointment details entered");

        appointmentPage.clickBookAppointment();

        log.info("Book Appointment button clicked");

        // Verify appointment confirmation
       boolean confirmationDisplayed =
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h2[contains(.,'Appointment')]")
                )
        ).isDisplayed();

        Assert.assertTrue(
                confirmationDisplayed,
                "Appointment confirmation was not displayed"
        );

        log.info(
                "Appointment confirmation displayed"
        );

        log.info(
                "========== BOOK APPOINTMENT TEST PASSED =========="
        );
    }
}