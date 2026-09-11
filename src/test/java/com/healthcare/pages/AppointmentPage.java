package com.healthcare.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppointmentPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By facility = By.id("combo_facility");

    private By readmission =
            By.id("chk_hospotal_readmission");

    private By medicaid =
            By.id("radio_program_medicaid");

    private By visitDate =
            By.id("txt_visit_date");

    private By comment =
            By.id("txt_comment");

    private By bookAppointment =
            By.id("btn-book-appointment");

    public AppointmentPage(WebDriver driver) {

        this.driver = driver;

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }

    public void fillAppointment() {

        // Select facility
        Select facilityDropdown = new Select(
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                facility
                        )
                )
        );

        facilityDropdown.selectByVisibleText(
                "Hongkong CURA Healthcare Center"
        );

        // Select hospital readmission
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        readmission
                )
        ).click();

        // Select Medicaid
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        medicaid
                )
        ).click();

        // Enter visit date
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        visitDate
                )
        ).click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        visitDate
                )
        ).sendKeys("27/12/2016");

        // Enter comment
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        comment
                )
        ).sendKeys(
                "Please make appointment as soon as possible."
        );
    }

    public void clickBookAppointment() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        bookAppointment
                )
        ).click();
    }
}