package org.example12.PageObjects.GS_LOGIN;


import org.example12.Enums.Login.LoginEnums;
import org.example12.constants.FrameworkPathConstants;
import org.example12.drivers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example12.ConfigLoaders.JsonUtils.getValue;
import static org.example12.PageObjects.GS_LOGIN.LoginPageLocators.*;
import static org.example12.Utilities.Utility.scrollToElement;
import static org.example12.Utilities.Utility.waitForInSeconds;
import static org.example12.drivers.WebDriverManager.getWebDriver;
import static org.example12.drivers.WebDriverManager.waitForElementToBeClickable;

public class Login {

    public void navigateToDemoQAPage() {
        getWebDriver().get(getValue(LoginEnums.URL, FrameworkPathConstants.Login_TEST_DATA_FILE_PATH));
    }

    //click to change the langage
    public void clickToChangeLanguage(){
        WebElement languageBtn = getWebDriver().findElement(By.cssSelector(engBtn));
        languageBtn.click();
    }


    // click profile btn to open the login modal
    public void clickProfile() throws InterruptedException {
        waitForInSeconds(5);
        By profileBtnBy = By.cssSelector(profileIconLoctor);
        WebElement profileIcon = getWebDriver().findElement(profileBtnBy);
        profileIcon.click();

    }

    //close Pop up if arise
    public void closePopup() {
        By popup = By.cssSelector(closePopup);

        // findElements won't throw exception if not found
        List<WebElement> popUps = getWebDriver().findElements(popup);

        if (!popUps.isEmpty() && popUps.get(0).isDisplayed()) {
            popUps.get(0).click();
            System.out.println("Popup was present and closed.");
        } else {
            System.out.println("Popup not present, skipping.");
        }
    }






    // method to enter phone number for login
    public void fillNumber(String phNo){

        By inputPhone = By.id(inputPhoneLocator);

        // Wait until the button is clickable
        WebDriverManager.waitForElementToBeVisible(inputPhone, 5);

        WebDriverManager.waitForElement(inputPhone,5);
        WebElement phNumber = getWebDriver().findElement(inputPhone);
        scrollToElement(phNumber);
        phNumber.sendKeys(phNo);

        // click after input phone number
        WebElement login = getWebDriver().findElement(By.xpath(loginBtn));
        login.click();

    }

    public void fillOTP(String OTP){
        By otpF1 = By.xpath(otpField1);
        waitForElementToBeClickable(otpF1, 5);

        WebElement otpField = getWebDriver().findElement(otpF1);
        scrollToElement(otpField);
        otpField.sendKeys(OTP);

    }

    public WebElement GetErrorMsg(){
        By errMsg = By.xpath(LoginPageLocators.errMsg);
        waitForElementToBeClickable(errMsg, 5);

        WebElement errorMsg = getWebDriver().findElement(errMsg);
       return errorMsg;

    }





}
