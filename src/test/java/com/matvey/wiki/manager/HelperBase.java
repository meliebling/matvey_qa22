package com.matvey.wiki.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {

    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void click(String cssSelector) {
        wd.findElement(By.cssSelector(cssSelector)).click();
    }


    public void clickEnglishWikiPage() throws InterruptedException {
        wd.findElement(By.id("js-link-box-en")).click();
        pause(5000);
    }

    public void type(By selector, String text){
        wd.findElement(selector).click();
        wd.findElement(selector).clear();
        wd.findElement(selector).sendKeys(text);

    }


}
