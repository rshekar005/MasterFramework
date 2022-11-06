package com.tmb.driver;

import com.tmb.config.ConfigFactory;
import com.tmb.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class Driver {

    private Driver() {
    }

    static WebDriver driver = null;

    public void initDriver() {
        driver = LocalDriverManager.getDriver();
        driver.get("https://www.google.com");
    }

    public void quitDriver() {

    }
}
