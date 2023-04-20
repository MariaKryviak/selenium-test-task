package com.rozetka.config;

import com.rozetka.utils.FileUtils;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
@Getter
public class ApplicationProperties {

    private String browserName;
    private Integer threadCount;

    private void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    private void setThreadCount(int threadCount) {
        this.threadCount = threadCount;
    }

    public ApplicationProperties() {
        loadProperties();
    }

    private void loadProperties() {
        Properties properties = getApplicationProperties();
        setBrowserName(properties.getProperty("browserName"));
        setThreadCount(Integer.parseInt(properties.getProperty("threadCount")));
    }

    @SneakyThrows
    private Properties getApplicationProperties() {
        return new FileUtils().readProperties("app.properties");
    }
}
