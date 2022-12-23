package com.tmb.driver.factory;

import com.tmb.driver.*;
import com.tmb.driver.impl.LocalMobileDriverImpl;
import com.tmb.driver.impl.LocalWebDriverImpl;
import com.tmb.driver.impl.RemoteMobileDriverImpl;
import com.tmb.driver.impl.RemoteWebDriverImpl;
import com.tmb.enums.RunModeType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {
    private DriverFactory() {
    }

    public static final Map<RunModeType, Supplier<IWebDriver>> WEB = new EnumMap<RunModeType, Supplier<IWebDriver>>(RunModeType.class);
    public static final Map<RunModeType, Supplier<IMobileDriver>> MOBILE = new EnumMap<RunModeType, Supplier<IMobileDriver>>(RunModeType.class);

    static {
        WEB.put(RunModeType.LOCAL, LocalWebDriverImpl::new);
        WEB.put(RunModeType.REMOTE, RemoteWebDriverImpl::new);
        MOBILE.put(RunModeType.REMOTE, RemoteMobileDriverImpl::new);
        MOBILE.put(RunModeType.LOCAL, LocalMobileDriverImpl::new);
    }

    public static IWebDriver getDriverForWeb(RunModeType runModeType) {
        return WEB.get(runModeType).get();

    }

    public static IMobileDriver getDriverForMobile(RunModeType runModeType) {
        return MOBILE.get(runModeType).get();
    }
}


