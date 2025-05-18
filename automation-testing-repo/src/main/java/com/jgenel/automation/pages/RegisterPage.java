package com.jgenel.automation.pages;
import com.jgenel.automation.enums.Gender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    // Ids and xPaths
    private By maleCircleCheck = By.id("id_gender1");
    private By femaleCircleCheck = By.id("id_gender2");
    private By passwordField = By.id("password");
    private By dayOfBirth = By.id("days");
    private By dayOfBirth = By.id("months");
    private By dayOfBirth = By.id("years");

    // Dropdown Handling
    WebElement dayDropdoWebElement = driver.findElement(dayOfBirth);
    Select selectDay = new Select(dayDropdoWebElement);

    WebElement yearDropdoWebElement = driver.findElement(yearOfBirth);
    Select selectYear = new Select(yearDropdoWebElement);

    // Methods

    public void setGender(Gender gender) {
        switch (gender) {
            case MALE:
                driver.findElement(maleCircleCheck).click();
                break;
            case FEMALE:
                driver.findElement(femaleCircleCheck).click();
                break;
        }
    }

    public void setDayOfBirth(int dayValue) {
        selectDay.selectByIndex(dayValue);
    }

    public void setYearOfBirth(int yearValue){
        selectYear
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

}