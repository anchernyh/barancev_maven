package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {

    private GroupHelper groupHelper;
    private NewContactHelper newContactHelper;
    protected StringBuffer verificationErrors = new StringBuffer();

    private boolean acceptNextAlert = true;

    public WebDriver driver;
    private String baseUrl;
    public void init() {
        System.setProperty("webdriver.gecko.driver", "C://Users/chernykh/Downloads/geckodriver-v0.30.0-win64/geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        //WebDriver driver = new MarionetteDriver(capabilities);
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        loginAddressbook("admin", "secret"); }
        public void loginAddressbook(String username, String password) {
            driver.findElement(By.name("user")).click();
            driver.findElement(By.name("user")).clear();
            driver.findElement(By.name("user")).sendKeys(username);
            driver.findElement(By.id("LoginForm")).click();
            driver.findElement(By.name("pass")).click();
            driver.findElement(By.name("pass")).clear();
            driver.findElement(By.name("pass")).sendKeys(password);
            driver.findElement(By.xpath("//input[@value='Login']")).click();
            groupHelper = new GroupHelper(driver);
            newContactHelper = new NewContactHelper(driver);
        }


    public void goToGroupsPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
          fail(verificationErrorString);
        }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NewContactHelper getNewContactHelper() {
        return newContactHelper;
    }
}
