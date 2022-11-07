package com.tmb.driver.manager.web.remote.browserstack;

import com.tmb.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackChromeManager {
    private BrowserStackChromeManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setCapability("browser","chrome");
        desiredCapabilities.setCapability("browser_version","latest");
        desiredCapabilities.setCapability("os","Windows");
        desiredCapabilities.setCapability("os_version","10");
        return new RemoteWebDriver(BrowserStackConfigFactory.get().browserstackURL(),desiredCapabilities);
    }
}
