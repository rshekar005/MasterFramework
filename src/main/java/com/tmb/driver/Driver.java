package com.tmb.driver;

import com.tmb.config.factory.ConfigFactory;
import com.tmb.driver.entity.MobileDriverData;
import com.tmb.driver.entity.WebDriverData;
import com.tmb.driver.factory.DriverFactory;
import com.tmb.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class Driver {

    private Driver() {
    }

    @Test

    public static void initDriverForWeb() {
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriverData webDriverData = new WebDriverData(ConfigFactory.get().browserRemoteMode(), ConfigFactory.get().browser());
            WebDriver driver = DriverFactory.getDriverForWeb(ConfigFactory.get().runMode()).getDriver(webDriverData);
            DriverManager.setDriver(driver);
            loadUrl();
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        }
    }

    public static void loadUrl(){
        DriverManager.getDriver().get(ConfigFactory.get().Weburl());
    }
    @Test
    public static void initDriverForMobile() {
        if (Objects.isNull(DriverManager.getDriver())) {
            MobileDriverData mobileDriverData = new MobileDriverData(MobilePlatformType.ANDROID, ConfigFactory.get().mobileRemoteMode());
            WebDriver driver = DriverFactory.getDriverForMobile(ConfigFactory.get().mobileRunMode()).getDriver(mobileDriverData);
            DriverManager.setDriver(driver);
        }
    }


    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
