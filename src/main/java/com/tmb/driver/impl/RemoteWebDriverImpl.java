package com.tmb.driver.impl;

import com.tmb.driver.IWebDriver;
import com.tmb.driver.entity.WebDriverData;
import com.tmb.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteMode(),
                driverData.getBrowserType());
    }
}
