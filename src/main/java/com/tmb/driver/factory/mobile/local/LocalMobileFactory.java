package com.tmb.driver.factory.mobile.local;

import com.tmb.driver.manager.mobile.local.AndroidManager;
import com.tmb.driver.manager.mobile.local.IOSManager;
import com.tmb.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class LocalMobileFactory {
    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP = new EnumMap<MobilePlatformType, Supplier<WebDriver>>(MobilePlatformType.class);
    private static final Supplier<WebDriver> Android = AndroidManager::getDriver;
    private static final Supplier<WebDriver> IOS = IOSManager::getDriver;

    static {
        MAP.put(MobilePlatformType.ANDROID, Android);
        MAP.put(MobilePlatformType.IOS, IOS);
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
        return MAP.get(mobilePlatformType).get();
    }
}
