package com.tmb.driver.factory.web.local;

import com.tmb.driver.manager.web.local.ChromeManager;
import com.tmb.driver.manager.web.local.FirefoxManager;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {
    private LocalDriverFactory() {
    }

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<BrowserType, Supplier<WebDriver>>(BrowserType.class);
    private static final Supplier<WebDriver> CHROME = ChromeManager::getDriver;
    private static final Supplier<WebDriver> FIREFOX = FirefoxManager::getDriver;

    static {
        MAP.put(BrowserType.CHROME, CHROME);
        MAP.put(BrowserType.FIREFOX, FIREFOX);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }
   /* Without lambda
   public static WebDriver getDriver(BrowserType browserType) {
        return isChromeBrowser(browserType) ? ChromeManager.getDriver() : FirefoxManager.getDriver();
    }

    private static boolean isChromeBrowser(BrowserType browserType) {
        return browserType == BrowserType.CHROME;
    }*/
}
