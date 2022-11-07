package com.tmb.config;

import com.tmb.converter.StringToBrowserTypeConverter;
import com.tmb.converter.StringToRunModeBrowser;
import com.tmb.converter.StringToURLConverter;
import com.tmb.enums.BrowserRemoteMode;
import com.tmb.enums.BrowserType;
import com.tmb.enums.RunModeBrowser;
import org.aeonbits.owner.Config;

import java.net.URL;

/**
 * @author : Rajashekar
 * This class is used to read value from config property/Jenkins variable / System Variable
 */
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {
    @DefaultValue("CHROME")
    @Key("browser")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    @ConverterClass(StringToRunModeBrowser.class)
    RunModeBrowser browserRunMode();

    @ConverterClass(StringToBrowserTypeConverter.class)
    @Key("browserRemoteMode")
    BrowserRemoteMode browserRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    @Key("seleniumGridURL")
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    @Key("selenoidURL")
    URL selenoidURL();
}
