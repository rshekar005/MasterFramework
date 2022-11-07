package com.tmb.tests;

import com.tmb.config.BrowserStackConfig;
import com.tmb.config.factory.BrowserStackConfigFactory;
import com.tmb.config.factory.ConfigFactory;
import org.junit.Test;

public class DemoTests {

    @Test
    public void test()  {

        System.out.println(BrowserStackConfigFactory.get().browserstackURL());
    }
}
