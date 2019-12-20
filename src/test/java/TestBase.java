import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public void openSite(String url) {
        driver.navigate().to(url);
    }

    public void clickElement(String cssSelector) {
        driver.findElement(By.cssSelector(cssSelector)).click();
    }

    public void getPageTitle(String cssSelector) {
        WebElement pageTitle = driver.findElement(By.cssSelector(cssSelector));
        String text = pageTitle.getText();
        System.out.println(text);
    }

    public void getTextContacts() throws InterruptedException {
        clickElement("#comp-k2d3m6ja6bg");
        Thread.sleep(3000);
        getPageTitle(".font_0");
        Thread.sleep(3000);
    }

    public void getTextBlog() throws InterruptedException {
        clickElement("#comp-k2d3m6ja5bg");
        Thread.sleep(3000);
        getPageTitle(".font_0");
        Thread.sleep(3000);
    }

    public void getTextReviews() throws InterruptedException {
        clickElement("#comp-k2d3m6ja4bg");
        Thread.sleep(3000);
        getPageTitle(".font_0");
        Thread.sleep(3000);
    }

    public void getTextEmployment() throws InterruptedException {
        clickElement("#comp-k2d3m6ja3bg");
        Thread.sleep(3000);
        getPageTitle(".font_0");
        Thread.sleep(3000);
    }

    public void getTextCourses() throws InterruptedException {
        clickElement("#comp-k2d3m6ja2bg");
        Thread.sleep(3000);
        getPageTitle(".font_0");
        Thread.sleep(3000);
    }

    public void getTextAboutUs() throws InterruptedException {
        clickElement("#comp-k2d3m6ja1");
        Thread.sleep(3000);
        getPageTitle(".font_0");
        Thread.sleep(3000);
    }
}
