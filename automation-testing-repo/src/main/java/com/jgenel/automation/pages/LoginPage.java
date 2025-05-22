package com.jgenel.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailLoginField = By.xpath("//input[@data-qa='login-email']");
    private By passwordLoginField = By.xpath("//input[@data-qa='login-password']");
    private By loginButton = By.xpath("//button[contains(text(),'Login')]");

    private By nameSignupField = By.xpath("//input[@data-qa='signup-name']");
    private By emailSignupField = By.xpath("//input[@data-qa='signup-email']");
    private By signupButton = By.xpath("//button[contains(text(),'Signup')]");

    private By emailSubscribe = By.id("subscribe_email");
    private By subscribeButton = By.id("subscribe");

    public void enterLoginEmail(String emailLogin) {
        driver.findElement(emailLoginField).sendKeys(emailLogin);
    }

    public void enterLoginPassword(String passwordLogin) {
        driver.findElement(passwordLoginField).sendKeys(passwordLogin);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void enterSignupName(String nameSignup) {
        driver.findElement(nameSignupField).sendKeys(nameSignup);
    }

    public void enterEmailSignup(String emailSignup) {
        driver.findElement(emailSignupField).sendKeys(emailSignup);
    }

    public void clickSignupButton() {
        driver.findElement(signupButton).click();
    }

}
