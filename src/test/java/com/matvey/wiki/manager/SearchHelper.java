package com.matvey.wiki.manager;

import com.matvey.wiki.model.SearchData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHelper extends HelperBase{
    public SearchHelper(WebDriver wd) {
        super(wd);
    }



    public String getArticleName() {
        return wd.findElement(By.id("firstHeading")).getText();
    }

    public void searchIcon() {
        wd.findElement(By.className("svg-search-icon")).click();
    }

    public void searchBar(SearchData searchData) {
        type(By.id("searchInput"), searchData.getText());

    }
}
