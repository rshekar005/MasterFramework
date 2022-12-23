package com.tmb.driver.manager.mobile.local;

import com.tmb.config.factory.ConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class IOSManager {

    private IOSManager(){}
    public static WebDriver getDriver(){
        System.out.println("IOS Test");
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/ios-app.zip");
        return new RemoteWebDriver(ConfigFactory.get().localAppiumServerURL(), desiredCapabilities);
    }

}
