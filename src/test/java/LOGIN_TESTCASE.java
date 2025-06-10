import org.example12.PageObjects.GS_LOGIN.Login;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.example12.PageObjects.GS_LOGIN.LoginPageLocators.errMsg;
import static org.example12.PageObjects.GS_LOGIN.LoginTestData.*;
import static org.example12.drivers.WebDriverManager.*;

public class LOGIN_TESTCASE {

    Login GS_Login;

    @BeforeSuite
    public void setUp() {
        setUpWebDriver();
        maximizeWindow();
        GS_Login = new Login();
    }

    @BeforeTest
    public void setUpTest() {
        GS_Login.navigateToDemoQAPage();
    }

    @Test
    public void GS_Valid_Login() throws InterruptedException {
        GS_Login.closePopup();
        GS_Login.clickToChangeLanguage();
        GS_Login.clickProfile();
        GS_Login.fillNumber(phoneTestData);
        GS_Login.fillOTP(otpTestData);


    }

    @Test
    public void GS_Invalid_Login() throws InterruptedException {

        GS_Login.closePopup();
        GS_Login.clickToChangeLanguage();
        GS_Login.clickProfile();
        GS_Login.fillNumber(phoneTestData);
        GS_Login.fillOTP(otp2TestData);
        Assert.assertEquals(GS_Login.GetErrorMsg().getText(),"OTP code is invalid or expired","CHeck if the OTP fails and Error Message is displayed");

    }


    


    @AfterSuite
    public void tearDown() {
        GS_Login = null;
        quitWebDriver();
    }
}