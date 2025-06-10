package org.example12.PageObjects.GS_LOGIN;


import org.example12.Enums.Login.LoginEnums;
import org.example12.constants.FrameworkPathConstants;

import static org.example12.ConfigLoaders.JsonUtils.getValue;

public class LoginPageLocators {
    public static final String profileBtnLoctor = getValue(LoginEnums.PROFILE_BTN, FrameworkPathConstants.LOGIN_LOCATORS_FILE_PATH);
    public static final String profileIconLoctor = getValue(LoginEnums.PROFILE_ICON, FrameworkPathConstants.LOGIN_LOCATORS_FILE_PATH);
    public static final String inputPhoneLocator = getValue(LoginEnums.INPUT_FIELD, FrameworkPathConstants.LOGIN_LOCATORS_FILE_PATH);
    public static final String loginBtn = getValue(LoginEnums.LOGIN_BTN, FrameworkPathConstants.LOGIN_LOCATORS_FILE_PATH);
    public static final String otpField1 = getValue(LoginEnums.OTP_FIELD1, FrameworkPathConstants.LOGIN_LOCATORS_FILE_PATH);
    public static final String otpFields = getValue(LoginEnums.OTP_FIELDS, FrameworkPathConstants.LOGIN_LOCATORS_FILE_PATH);
    public static final String closePopup = getValue(LoginEnums.CLOSE_POPUP, FrameworkPathConstants.LOGIN_LOCATORS_FILE_PATH);
    public static final String engBtn = getValue(LoginEnums.ENG_BTN, FrameworkPathConstants.LOGIN_LOCATORS_FILE_PATH);
    public static final String errMsg = getValue(LoginEnums.ERROR_MSG, FrameworkPathConstants.LOGIN_LOCATORS_FILE_PATH);

}


