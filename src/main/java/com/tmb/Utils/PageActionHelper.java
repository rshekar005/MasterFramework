package com.tmb.Utils;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.function.Consumer;

public final class PageActionHelper {
    private PageActionHelper(){}

    public static void waitAndClick(By by){
        DriverManager.getDriver().findElement(by).click();
    }
    public static void waitAndSendKeys(By by,String value){
        DriverManager.getDriver().findElement(by).sendKeys(value);
    }
    public static void select(By by, Consumer<Select> consumer){
        consumer.accept(new Select(DriverManager.getDriver().findElement(by)));
    }
}
