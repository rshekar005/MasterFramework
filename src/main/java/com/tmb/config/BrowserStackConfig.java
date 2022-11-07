package com.tmb.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/resources/browser_stack.properties"
})
public interface BrowserStackConfig extends Config {

    @Key("username")
    String userName();

    @Key("password")
    String password();

    @DefaultValue("https://${username}:${password}@hub-cloud.browserstack.com/wd/hub")
    URL browserstackURL();
}
