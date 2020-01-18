package com.matvey.wiki.tests;

import com.matvey.wiki.model.SearchData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchJavaInWiki extends TestBase{


    @Test
    public void searchWikipediaTest() throws InterruptedException {
        String searchText="Java";
        app.getSearch().searchBar(new SearchData(searchText));
        app.getSearch().searchIcon();
        app.getSearch().pause(3000);
        app.getSearch().getArticleName();
        String articleName = app.getSearch().getArticleName();
        Assert.assertEquals(searchText,articleName);
    }


}
