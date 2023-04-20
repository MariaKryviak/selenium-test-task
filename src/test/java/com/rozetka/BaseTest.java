package com.rozetka;

import com.rozetka.config.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups = "all")
public class BaseTest {

    public ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    @BeforeMethod
    public void setUp() {
        threadLocalDriver.set(new DriverManager().generateWebDriver());
    }

    @AfterMethod
    public void tearDown() {
        threadLocalDriver.get().quit();
    }
}
