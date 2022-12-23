package com.tmb.driver.factory.web.remote;

import com.tmb.enums.BrowserRemoteMode;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {
    private RemoteDriverFactory() {
    }

    private static final Map<BrowserRemoteMode, Function<BrowserType, WebDriver>> MAP = new EnumMap<>(BrowserRemoteMode.class);
    private static final Function<BrowserType, WebDriver> SELENIUM = SeleniumGridFactory::getDriver;
    private static final Function<BrowserType, WebDriver> SELENOID = SelenoidFactory::getDriver;
    private static final Function<BrowserType, WebDriver> BROWSER_STACK = BrowserstackFactory::getDriver;

    static {
        MAP.put(BrowserRemoteMode.SELENIUM, SELENIUM);
        MAP.put(BrowserRemoteMode.SELENOID, SELENOID);
        MAP.put(BrowserRemoteMode.BROWSER_STACK, BROWSER_STACK);
    }

    public static WebDriver getDriver(BrowserRemoteMode browserRemoteMode, BrowserType browserType) {
        System.out.println(browserRemoteMode.name());
        return MAP.get(browserRemoteMode).apply(browserType);
    }
    /* Traditional Way
    public static WebDriver getDriver(BrowserRemoteMode browserRemoteMode, BrowserType browserType) {
        if (browserRemoteMode == BrowserRemoteMode.SELENIUM) {
            return SeleniumGridFactory.getDriver(browserType);
        } else if (browserRemoteMode == BrowserRemoteMode.BROWSER_STACK) {
            return SelenoidFactory.getDriver(browserType);
        } else if (browserRemoteMode == BrowserRemoteMode.SELENOID) {
        return BrowserstackFactory.getDriver(browserType);
        }
        return null;
    }*/

}
