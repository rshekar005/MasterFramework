package com.tmb.driver.entity;

import com.tmb.enums.BrowserRemoteMode;
import com.tmb.enums.BrowserType;
import com.tmb.enums.RunModeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {
    private BrowserRemoteMode browserRemoteMode;
    private BrowserType browserType;

}
