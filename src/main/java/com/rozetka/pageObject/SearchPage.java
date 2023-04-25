package com.rozetka.pageObject;

import com.rozetka.config.DriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Slf4j
public class SearchPage extends HomePage {

    private final WebDriver driver = DriverManager.getWebDriver();
    private final By searchText = By.xpath("//rz-search-heading/div/h1");

    public String getSearchResult() {
        String searchingResult = driver.findElement(searchText).getText();
        log.info("Search result is: [{}]", searchingResult);
        return searchingResult;
    }
}
