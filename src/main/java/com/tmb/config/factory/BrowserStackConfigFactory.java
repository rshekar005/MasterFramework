package com.tmb.config.factory;

import com.tmb.config.BrowserStackConfig;
import org.aeonbits.owner.ConfigCache;

public class BrowserStackConfigFactory {

    public static BrowserStackConfig get(){
        return ConfigCache.getOrCreate(BrowserStackConfig.class);
    }
}
