package com.jgenel.automation.tests;

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

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://www.automationexercise.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.enterLoginEmail("test@qwerty.com");
        loginPage.enterLoginPassword("verystrongpassword");
        loginPage.clickLoginButton();
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
