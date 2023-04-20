package com.rozetka.config;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@Slf4j
public class DriverManager {

    public WebDriver generateWebDriver() {
        String baseUrl = new EnvProperties().getBaseUrl();
        log.info("Set base URL [{}]", baseUrl);
        WebDriver webDriver = new Browser().getWebDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get(baseUrl);
        return webDriver;
    }
}
