package com.rozetka.businessObject;

import com.rozetka.pageObject.HomePage;
import org.openqa.selenium.WebDriver;

public class SearchProduct {

    private final WebDriver driver;

    public SearchProduct(WebDriver driver) {
        this.driver = driver;
    }

    public String searchSomeProduct(String searchWord) {
        return new HomePage(driver)
                .searchField(searchWord)
                .clickSearchButton()
                .getFindingResult();
    }
}
