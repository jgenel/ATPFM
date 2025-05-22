package com.jgenel.automation.tests;

import com.jgenel.automation.enums.Gender;
import com.jgenel.automation.enums.Months;
import com.jgenel.automation.enums.Country;

import com.jgenel.automation.pages.RegisterPage;
import com.jgenel.automation.pages.LoginPage;
import com.jgenel.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.jgenel.automation.utils.ScreenshotUtil;

import static org.testng.Assert.assertTrue;

public class RegisterTest {

    private WebDriver driver;
    private RegisterPage registerPage;
    private LoginPage loginPage;

    // We need to put data in the login page to acces to the signup page
    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://www.automationexercise.com/signup");
        loginPage = new LoginPage(driver);
        loginPage.enterSignupName("test");
        loginPage.enterEmailSignup("test@qwerty.com");
        loginPage.clickSignupButton();
        registerPage = new RegisterPage(driver);
    }

    @Test
    public void testRegistration() {
        registerPage.setGender(Gender.MALE);
        registerPage.setPassword("verystrongpassword");
        registerPage.setDayOfBirth(10);
        registerPage.setMonthOfBirth(Months.NOVEMBER);
        registerPage.setYearOfBirth(1999);
        registerPage.clickNewsletterSignUp();
        registerPage.clickSpecialOffersSignUp();
        registerPage.setFirstName("Ava Slea");
        registerPage.setLastName("Qwert Asdf");
        registerPage.setCompany("Company");
        registerPage.setAddress("Address test");
        registerPage.setAddressTwo("Address Two Data");
        registerPage.setCountry(Country.USA);
        registerPage.setState("State Text");
        registerPage.setCity("City Text");
        registerPage.setZipcode("zipcode test");
        registerPage.setMobileNumber("1111111111111");
        // registerPage.clickCreateAccountButton(); disabled for a while
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
