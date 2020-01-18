package com.matvey.wiki.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager{


   WebDriver wd;
   SearchHelper search;
   SessionHelper session;


    public void init()  {
        String browser = System.getProperty("browser", BrowserType.CHROME);
        if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        }
        else
        if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        }

        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openSite("https://www.wikipedia.org/");

        session = new SessionHelper(wd);
        search = new SearchHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public SearchHelper getSearch() {
        return search;
    }

    public SessionHelper getSession() {
        return session;
    }
}
