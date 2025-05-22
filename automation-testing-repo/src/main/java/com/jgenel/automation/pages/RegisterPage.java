package com.jgenel.automation.pages;

import com.jgenel.automation.enums.Gender;
import com.jgenel.automation.enums.Country;
import com.jgenel.automation.enums.Months;

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
    // Account Information
    private By passwordField = By.id("password");

    private By dayOfBirth = By.id("days");
    private By monthOfBirth = By.id("months");
    private By yearOfBirth = By.id("years");

    private By newsletterCheckbox = By.id("newsletter");
    private By specialOffersCheckbox = By.id("optin");

    // Address Information

    private By firstNameTextField = By.id("first_name");
    private By lastNameTextField = By.id("last_name");
    private By companyTextField = By.id("company");
    private By adressTextField = By.id("address1");
    private By addresTwoTextField = By.id("address2");
    private By countryDropDown = By.id("country");
    private By stateTextField = By.id("state");
    private By cityTextField = By.id("city");
    private By zipcodeTextField = By.id("zipcode");
    private By mobileNumberTextField = By.id("mobile_number");

    private By createAccountButton = By.xpath("//button[contains(text(),'Create Account')]");

    //  Account Information Methods
    public void setGender(Gender gender) {
        driver.findElement(By.id(gender.getGenderId())).click();
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setDayOfBirth(int dayValue) {
        WebElement dayDropdoWebElement = driver.findElement(dayOfBirth);
        Select selectDay = new Select(dayDropdoWebElement);
        selectDay.selectByIndex(dayValue);
    }

    public void setYearOfBirth(int yearValue){
        WebElement yearDropdoWebElement = driver.findElement(yearOfBirth);
        Select selectYear = new Select(yearDropdoWebElement);
        selectYear.selectByVisibleText(String.valueOf(yearValue));
    }

    public void setMonthOfBirth(Months monthValue){
        WebElement monthDropdoWebElement = driver.findElement(monthOfBirth);
        Select selectMonth = new Select(monthDropdoWebElement);
        selectMonth.selectByIndex(monthValue.getMonth());
    }

    public void clickNewsletterSignUp(){
        driver.findElement(newsletterCheckbox).click();
    }

    public void clickSpecialOffersSignUp(){
        driver.findElement(specialOffersCheckbox).click();
    }

    // Address Information
    public void setFirstName(String firstName) {
        driver.findElement(firstNameTextField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameTextField).sendKeys(lastName);
    }

    public void setCompany(String company) {
        driver.findElement(companyTextField).sendKeys(company);
    }

    public void setAddress(String adress) {
        driver.findElement(adressTextField).sendKeys(adress);
    }

    public void setAddressTwo(String adressTwo) {
        driver.findElement(addresTwoTextField).sendKeys(adressTwo);
    }

    public void setCountry(Country country) {
        WebElement countryDropdoWebElement = driver.findElement(countryDropDown);
        Select selectCountry = new Select(countryDropdoWebElement);
        selectCountry.selectByVisibleText(country.getCountry());
    }

    public void setState(String state) {
        driver.findElement(stateTextField).sendKeys(state);
    }

    public void setCity(String city) {
        driver.findElement(cityTextField).sendKeys(city);
    }

    public void setZipcode(String zipcode){
        driver.findElement(zipcodeTextField).sendKeys(zipcode);
    }

    public void setMobileNumber(String mobileNumber){
        driver.findElement(mobileNumberTextField).sendKeys(mobileNumber);
    }

    public void clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
    }

}