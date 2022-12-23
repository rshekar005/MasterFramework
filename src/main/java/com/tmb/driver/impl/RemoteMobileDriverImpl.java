package com.tmb.driver.impl;

import com.tmb.driver.IMobileDriver;
import com.tmb.driver.entity.MobileDriverData;
import com.tmb.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {
    @Override
    public WebDriver getDriver(MobileDriverData mobileDriverData) {
        return RemoteMobileDriverFactory.getDriver(mobileDriverData.getMobileRemoteType(),
                mobileDriverData.getMobilePlatformType());
    }
}
