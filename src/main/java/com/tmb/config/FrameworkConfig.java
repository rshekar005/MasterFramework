package com.tmb.config;

import com.tmb.converter.*;
import com.tmb.enums.BrowserRemoteMode;
import com.tmb.enums.BrowserType;
import com.tmb.enums.MobileRemoteType;
import com.tmb.enums.RunModeType;
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
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties",
        "file:${user.dir}/src/test/resources/dev-config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("staging") q
    String environment();

    @Key("${environment}.webUrl")
    String Weburl();
    @DefaultValue("CHROME")
    @Key("browser")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runMode")
    @ConverterClass(StringToRunModeBrowser.class)
    RunModeType runMode();

    @Key("mobileRunMode")
    @ConverterClass(StringToRunModeBrowser.class)
    RunModeType mobileRunMode();

    @ConverterClass(StringToBrowserRemoteModeConverter.class)
    @Key("browserRemoteMode")
    BrowserRemoteMode browserRemoteMode();

    @ConverterClass(StringToMobileRemoteMode.class)
    @Key("mobileRemoteMode")
    MobileRemoteType mobileRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    @Key("seleniumGridURL")
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    @Key("selenoidURL")
    URL selenoidURL();

    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL localAppiumServerURL();
}
