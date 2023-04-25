package com.rozetka.businessObject;

import com.rozetka.pageObject.HomePage;

public class SearchProduct {

    public String searchSomeProduct(String searchWord) {
        return new HomePage()
                .setSearchCriteria(searchWord)
                .clickSearchButton()
                .getSearchResult();
    }
}
