package com.rozetka.pageObject;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Slf4j
public class SearchPage extends HomePage {

    private final WebDriver driver;
    private final By searchText = By.xpath("//rz-search-heading/div/h1");

    public SearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getFindingResult() {
        String searchingResult = driver.findElement(searchText).getText();
        log.info("Search result is: '{}'", searchingResult);
        return searchingResult;
    }
}
