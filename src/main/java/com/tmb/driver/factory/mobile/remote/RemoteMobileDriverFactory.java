package com.tmb.driver.factory.mobile.remote;

import com.tmb.driver.factory.web.remote.BrowserstackFactory;
import com.tmb.driver.factory.web.remote.SeleniumGridFactory;
import com.tmb.enums.MobilePlatformType;
import com.tmb.enums.MobileRemoteType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {
    private RemoteMobileDriverFactory() {
    }

    private static final Map<MobileRemoteType, Function<MobilePlatformType, WebDriver>> MAP = new EnumMap<>(MobileRemoteType.class);
   // private static final Function<MobilePlatformType, WebDriver> SAUCE_LABS = SeleniumGridFactory::getDriver;
    private static final Function<MobilePlatformType, WebDriver> BROWSER_STACK = BrowserStackMobileFactory::getDriver;

    static {
        //MAP.put(MobileRemoteType.SAUCE_LABS, SAUCE_LABS);
        MAP.put(MobileRemoteType.BROWSER_STACK, BROWSER_STACK);
    }

    public static WebDriver getDriver(MobileRemoteType mobileRemoteType, MobilePlatformType mobilePlatformType) {
        return MAP.get(mobileRemoteType).apply(mobilePlatformType);
    }
}
