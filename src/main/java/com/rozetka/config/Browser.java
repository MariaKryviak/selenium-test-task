package com.rozetka.config;

import com.rozetka.exception.BrowserDriverNotFoundException;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

@Slf4j
public class Browser {

    @SneakyThrows
    public WebDriver getWebDriver() {
        String browserName = ApplicationProperties.getInstance().getBrowserName();
        log.info("Selected browser: '{}'", browserName);
        switch (browserName.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.merge(getCapabilities());
                return new ChromeDriver(options);
            //TODO: can add more Browsers
            default:
                throw new BrowserDriverNotFoundException(browserName);
        }
    }

    private DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // TODO: Set some useful capabilities.
        return capabilities;
    }
}