package com.tmb.converter;

import com.tmb.enums.MobileRemoteType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobileRemoteMode implements Converter<MobileRemoteType> {
    @Override
    public MobileRemoteType convert(Method method, String mobileType) {
        return MobileRemoteType.valueOf(mobileType.toUpperCase());
    }
}
