package com.tmb.driver;

import com.tmb.config.ConfigFactory;
import com.tmb.driver.manager.ChromeManager;
import com.tmb.driver.manager.FirefoxManager;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverManager {
    private LocalDriverManager() {
    }
    public static WebDriver getDriver() {
        WebDriver driver = null;
        if (ConfigFactory.get().browser() == BrowserType.CHROME) {
            driver = ChromeManager.getDriver();
        } else if (ConfigFactory.get().browser() == BrowserType.FIREFOX) {
            driver = FirefoxManager.getDriver();
        }
        return driver;
    }
}
