package com.emiCalculator.pom.BaseTest;

import com.emiCalculator.pom.util.GeneralUtil;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class EmiCalculatorBaseTest {
    protected static AndroidDriver driver;


    @BeforeClass
    public void appiumSetup(){

        try {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("uid", "LHTDU16C03005729");
        capabilities.setCapability("platformVersion", "6");
        capabilities.setCapability("appPackage", "com.continuum.emi.calculator");
        capabilities.setCapability("appActivity", "com.finance.emicalci.activity.Splash_screnn");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("fullReset", "false");
        capabilities.setCapability("platformName", "Android");



        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(GeneralUtil.LOAD_Time));

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
