package com.tmb.driver;

import com.tmb.config.ConfigFactory;
import com.tmb.enums.BrowserRemoteMode;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {
    private RemoteDriverFactory() {
    }

    public static WebDriver getDriver() {
        BrowserRemoteMode browserRemoteMode = ConfigFactory.get().browserRemoteMode();
        if (browserRemoteMode == BrowserRemoteMode.SELENIUM) {

        } else if (browserRemoteMode == BrowserRemoteMode.BROWSER_STACK) {

        } else if (browserRemoteMode == BrowserRemoteMode.SELENOID) {

        }
        return null;
    }

}
