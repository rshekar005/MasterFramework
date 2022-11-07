package com.tmb.driver.manager.web.remote.selenium;

import com.tmb.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridFirefoxManager {
    private SeleniumGridFirefoxManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName(BrowserType.FIREFOX);
        return new RemoteWebDriver(ConfigFactory.get().seleniumGridURL(), desiredCapabilities);
    }
}
