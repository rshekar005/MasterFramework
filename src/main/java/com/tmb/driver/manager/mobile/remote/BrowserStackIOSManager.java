package com.tmb.driver.manager.mobile.remote;

import com.tmb.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackIOSManager {
    private BrowserStackIOSManager(){}
    public static WebDriver getDriver(){
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setCapability("app","");
        desiredCapabilities.setCapability("device","");
        desiredCapabilities.setCapability("os_version","");
        desiredCapabilities.setCapability("project","");
        desiredCapabilities.setCapability("build","");

        return new RemoteWebDriver(BrowserStackConfigFactory.get().browserstackURL(), desiredCapabilities);

    }
}
