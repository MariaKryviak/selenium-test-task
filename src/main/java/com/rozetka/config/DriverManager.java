package com.rozetka.config;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@Slf4j
public class DriverManager {

    private static final ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public static WebDriver getWebDriver() {
        if (threadLocalDriver.get() == null)
            initWebDriver();
        return threadLocalDriver.get();
    }

    private static void initWebDriver() {
        String baseUrl = EnvProperties.getInstance().getBaseUrl();
        log.info("Set base URL [{}]", baseUrl);
        WebDriver webDriver = new Browser().getWebDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get(baseUrl);
        threadLocalDriver.set(webDriver);
    }

    public static void closeDriver() {
        if (threadLocalDriver.get() != null) {
            threadLocalDriver.get().quit();
            threadLocalDriver.remove();
            log.info("Driver is closed");
        }
    }
}
