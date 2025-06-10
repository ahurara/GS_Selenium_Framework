package org.example12.drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WebDriverManager {

    private static WebDriver driver;

    public static void setUpWebDriver() {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static void quitWebDriver() {
        driver.quit();
        driver = null;
    }

    public static void closeWebDriver() {
        driver.close();
    }

    public static WebDriver getWebDriver() {
        return driver;
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void maximizeWindow() {
        driver.manage().window().maximize();
    }

    // Dynamic wait method
    public static WebElement waitForElement(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }


    //
    public static void waitForElementToBeClickable(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void actionClassElementClick(By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }


}