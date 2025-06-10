package org.example12.PageObjects.GS_LOGIN;

import org.example12.ConfigLoaders.EnvConfig;

public class LoginTestData {
    public static final String phoneTestData = EnvConfig.getValue("PH_NUMBER");
    public static final String otpTestData = EnvConfig.getValue("OTP");
    public static final String otp2TestData = EnvConfig.getValue("OTP2");
}
