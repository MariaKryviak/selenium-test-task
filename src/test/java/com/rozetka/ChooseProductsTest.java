package com.rozetka;

import com.rozetka.businessObject.SearchProduct;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChooseProductsTest extends BaseTest {

    @Test
    public void searchWaterProductsTest() {
        String searchWord = "water";
        String actualResult = new SearchProduct()
                .searchSomeProduct(searchWord);
        Assert.assertTrue(actualResult.contains(searchWord),
                String.format("Result not contains expected string %s", actualResult));
    }

    @Test
    public void searchPhoneProductsTest() {
        String searchWord = "phone";
        String actualResult = new SearchProduct()
                .searchSomeProduct(searchWord);
        Assert.assertTrue(actualResult.contains(searchWord),
                String.format("Result not contains expected string %s", actualResult));
    }

    @Test
    public void searchMirrorProductsTest() {
        String searchWord = "mirror";
        String actualResult = new SearchProduct()
                .searchSomeProduct(searchWord);
        Assert.assertTrue(actualResult.contains(searchWord),
                String.format("Result not contains expected string %s", actualResult));
    }
}
