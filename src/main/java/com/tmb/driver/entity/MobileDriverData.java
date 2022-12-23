package com.tmb.driver.entity;

import com.tmb.enums.MobilePlatformType;
import com.tmb.enums.MobileRemoteType;
import com.tmb.enums.RunModeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {
    private MobilePlatformType mobilePlatformType;
    private MobileRemoteType mobileRemoteType;

}
