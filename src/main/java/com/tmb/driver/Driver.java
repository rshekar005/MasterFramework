package com.tmb.driver;

import com.tmb.config.factory.ConfigFactory;
import com.tmb.driver.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver() {
    }

    static WebDriver driver = null;

    public void initDriver() {
        driver = LocalDriverFactory.getDriver(ConfigFactory.get().browser());
        driver.get("https://www.google.com");
    }

    public void quitDriver() {

    }
}
