package com.tmb.config;

import com.tmb.converter.StringToBrowserTypeConverter;
import com.tmb.enums.BrowserType;
import org.aeonbits.owner.Config;

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
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
}
