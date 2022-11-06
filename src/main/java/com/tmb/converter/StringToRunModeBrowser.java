package com.tmb.converter;

import com.tmb.enums.RunModeBrowser;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRunModeBrowser implements Converter<RunModeBrowser> {
    @Override
    public RunModeBrowser convert(Method method, String runModeBrowser) {
        return RunModeBrowser.valueOf(runModeBrowser.toUpperCase());
    }
}
