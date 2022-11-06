package com.tmb.converter;

import com.tmb.enums.BrowserRemoteMode;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserRemoteModeConverter implements Converter<BrowserRemoteMode> {
    @Override
    public BrowserRemoteMode convert(Method method, String browserRemoteMode) {
        return BrowserRemoteMode.valueOf(browserRemoteMode.toUpperCase());
    }
}
