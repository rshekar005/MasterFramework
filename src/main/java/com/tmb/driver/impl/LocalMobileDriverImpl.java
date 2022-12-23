package com.tmb.driver.impl;

import com.tmb.driver.IMobileDriver;
import com.tmb.driver.entity.MobileDriverData;
import com.tmb.driver.factory.mobile.local.LocalMobileFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {
    @Override
    public WebDriver getDriver(MobileDriverData mobileDriverData) {
        return LocalMobileFactory.getDriver(mobileDriverData.getMobilePlatformType());
    }


}
