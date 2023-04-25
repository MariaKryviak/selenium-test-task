package com.rozetka;

import com.rozetka.config.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups = "all")
public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverManager.getWebDriver();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.closeDriver();
    }
}
