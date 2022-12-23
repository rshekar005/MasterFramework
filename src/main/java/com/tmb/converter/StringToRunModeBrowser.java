package com.tmb.converter;

import com.tmb.enums.RunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRunModeBrowser implements Converter<RunModeType> {
    @Override
    public RunModeType convert(Method method, String runModeBrowser) {
        return RunModeType.valueOf(runModeBrowser.toUpperCase());
    }
}
