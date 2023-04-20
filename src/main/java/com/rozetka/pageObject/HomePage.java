package com.rozetka.pageObject;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Slf4j
public class HomePage {

    private final WebDriver driver;

    private final By searchTextField = By.xpath("//rz-main-header//input");
    private final By searchButton = By.xpath("//rz-main-header/header//form/button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage searchField(String search) {
        log.info("Enter search string [{}] into field", search);
        driver.findElement(searchTextField).sendKeys(search);
        return this;
    }

    public SearchPage clickSearchButton() {
        log.info("Click search");
        driver.findElement(searchButton).click();
        return new SearchPage(driver);
    }
}
