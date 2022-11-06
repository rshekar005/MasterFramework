package com.tmb.config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig get(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
