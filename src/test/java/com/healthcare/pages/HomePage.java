package com.healthcare.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By makeAppointmentButton = By.id("btn-make-appointment");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickMakeAppointment() {
        wait.until(ExpectedConditions.elementToBeClickable(makeAppointmentButton))
                .click();
    }
}