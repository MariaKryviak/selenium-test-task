package com.rozetka.config;

import com.rozetka.utils.FileUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class ApplicationProperties {

    @Getter
    private String browserName;
    @Getter
    private Integer threadCount;
    private static ApplicationProperties instance;

    private void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    private void setThreadCount(int threadCount) {
        this.threadCount = threadCount;
    }

    public static ApplicationProperties getInstance() {
        if (instance == null)
            instance = new ApplicationProperties();
        return instance;
    }

    private ApplicationProperties() {
        loadProperties();
    }

    private void loadProperties() {
        Properties properties = getApplicationProperties();
        setBrowserName(properties.getProperty("browserName"));
        setThreadCount(Integer.parseInt(properties.getProperty("threadCount")));
    }

    private Properties getApplicationProperties() {
        return new FileUtils().readProperties("app.properties");
    }
}
