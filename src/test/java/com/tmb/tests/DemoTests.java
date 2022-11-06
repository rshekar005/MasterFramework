package com.tmb.tests;

import com.tmb.config.ConfigFactory;
import com.tmb.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTests {

    @Test
    public void test()  {

        System.out.println(ConfigFactory.get().browser());
     /*   WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.quit();*/
    }
}
