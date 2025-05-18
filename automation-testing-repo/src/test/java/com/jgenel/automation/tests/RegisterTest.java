package com.jgenel.automation.tests;
package com.jgenel.automation.enums.Gender;

import com.jgenel.automation.enums.Gender;
import com.jgenel.automation.pages.RegisterPage;
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

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("http://automationexercise.com");
        registerPage = new RegisterPage(driver);
    }

    @Test
    public void testRegistration() {
        registerPage.setGender(Gender.MALE);
        registerPage.setDayOfBirth(10);
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
