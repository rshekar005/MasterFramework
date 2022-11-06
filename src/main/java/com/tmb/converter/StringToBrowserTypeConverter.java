package com.tmb.converter;

import com.tmb.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author : Rajashekar
 * This class is used to convert String to BrowserType Enum
 */
public class StringToBrowserTypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browserName) {
        return BrowserType.valueOf(browserName.toUpperCase());
    }
}
