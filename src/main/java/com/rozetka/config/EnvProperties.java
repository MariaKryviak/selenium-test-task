package com.rozetka.config;

import com.rozetka.enums.ENVS;
import com.rozetka.exception.EnvNotFoundException;
import com.rozetka.utils.FileUtils;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
@Getter
public class EnvProperties {

    private static final String APP_PROP_TPL = "%s-env.properties";
    private String baseUrl;

    private void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public EnvProperties() {
        loadProperties(System.getProperty("environment"));
    }

    private void loadProperties(String env) {
        Properties properties = getEnvProperties(env);
        setBaseUrl(properties.getProperty("baseUrl"));
    }

    @SneakyThrows
    private Properties getEnvProperties(String env) {
        env = env == null ? "test" : env.toLowerCase();
        if (ENVS.isEnvExist(env))
            return new FileUtils().readProperties(String.format(APP_PROP_TPL, env));
        log.warn("No loaded properties for environment [{}]", env);
        throw new EnvNotFoundException(env);
    }
}


