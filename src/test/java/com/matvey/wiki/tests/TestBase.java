package com.matvey.wiki.tests;

import com.matvey.wiki.manager.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    protected static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp() {
        app.init();

    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }


}
