package com.matvey.wiki.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{
    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void clickLog_In() {
        wd.findElement(By.id("pt-login")).click();
    }

    public boolean areYouLoggedIn() {
        return wd.findElements(By.id("pt-logout")).size()>0;
    }

    public void clickLoginButton() {
        wd.findElement(By.id("wpLoginAttempt")).click();
    }

    public void fillPassword() throws InterruptedException {
        wd.findElement(By.id("wpPassword1")).click();
        wd.findElement(By.id("wpPassword1")).clear();
        wd.findElement(By.id("wpPassword1")).sendKeys("a0Z7%0F5");
        Thread.sleep(3000);

    }

    public void fillLogin() throws InterruptedException {
        wd.findElement(By.id("wpName1")).click();
        wd.findElement(By.id("wpName1")).click();
        wd.findElement(By.id("wpName1")).clear();
        wd.findElement(By.id("wpName1")).sendKeys("matvey.telran");
        Thread.sleep(3000);
    }
}
