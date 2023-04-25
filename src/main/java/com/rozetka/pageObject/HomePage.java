package com.rozetka.pageObject;

import com.rozetka.config.DriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Slf4j
public class HomePage {

    private final WebDriver driver = DriverManager.getWebDriver();

    private final By searchTextField = By.xpath("//rz-main-header//input");
    private final By searchButton = By.xpath("//rz-main-header/header//form/button");

    public HomePage setSearchCriteria(String searchCriteria) {
        log.info("Enter search criteria [{}] into search field", searchCriteria);
        driver.findElement(searchTextField).sendKeys(searchCriteria);
        return this;
    }

    public SearchPage clickSearchButton() {
        log.info("Click search");
        driver.findElement(searchButton).click();
        return new SearchPage();
    }
}
