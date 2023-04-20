package com.rozetka.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Slf4j
public class FileUtils {

    public Properties readProperties(String fileName) {
        Properties prop = new Properties();
        try (InputStream input = FileUtils.class.getClassLoader().getResourceAsStream(fileName)) {
            prop.load(input);
            log.info("Loaded properties file [{}]", fileName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }
}
