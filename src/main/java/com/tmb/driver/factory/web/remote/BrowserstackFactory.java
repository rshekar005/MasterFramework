package com.tmb.driver.factory.web.remote;

import com.tmb.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.tmb.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class BrowserstackFactory {
    private BrowserstackFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? BrowserStackChromeManager.getDriver()
                : BrowserStackFirefoxManager.getDriver();

    }
}
