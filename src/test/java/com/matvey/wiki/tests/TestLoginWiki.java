package com.matvey.wiki.tests;

import org.testng.annotations.*;

public class TestLoginWiki extends TestBase {

    @Test
    public void openWikipediaTest() throws InterruptedException {
        app.getSession().clickEnglishWikiPage();
        app.getSession().clickLog_In();
        app.getSession().fillLogin();
        app.getSession().fillPassword();
        app.getSession().pause(3000);
        app.getSession().clickLoginButton();
        app.getSession().areYouLoggedIn();

    }


}

