package com.tmb.driver.manager.web.remote.selenoid;

import com.tmb.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidChromeManager {
    private SelenoidChromeManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setCapability("browserName","chrome");
        desiredCapabilities.setCapability("browserVersion","97.0");
        desiredCapabilities.setCapability("enableVNC",true);
        desiredCapabilities.setCapability("enableVideo",true);
        return new RemoteWebDriver(ConfigFactory.get().selenoidURL(),desiredCapabilities);
    }
}
