import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void openSite(String url) {
        driver.navigate().to(url);
    }

    public void clickElement(String cssSelector) {
        driver.findElement(By.cssSelector(cssSelector)).click();
    }

    public void getPageTitle(String cssSelector, String xpath) throws InterruptedException {
        String pageTitle = driver.findElement(By.cssSelector(cssSelector)).getText();        Thread.sleep(3000);
        Thread.sleep(3000);
        String menuTitle = driver.findElement(By.xpath(xpath)).getText();
        Thread.sleep(3000);
        System.out.println("menu:" +menuTitle+ ";page:"+pageTitle);
        Assert.assertEquals(menuTitle, pageTitle);

    }

    public void getTextContacts() throws InterruptedException {
        clickElement("#comp-k2d3m6ja6bg");
        Thread.sleep(3000);
        getPageTitle(".font_0", "//p[@id='comp-k2d3m6ja6label']");
        Thread.sleep(3000);


    }

    public void getTextBlog() throws InterruptedException {
        clickElement("#comp-k2d3m6ja5bg");
        Thread.sleep(3000);
        getPageTitle(".font_0", "//p[@id='comp-k2d3m6ja5label']");
        Thread.sleep(3000);
    }

    public void getTextReviews() throws InterruptedException {
        clickElement("#comp-k2d3m6ja4bg");
        Thread.sleep(3000);
        getPageTitle(".font_0", "//p[@id='comp-k2d3m6ja4label']");
        Thread.sleep(3000);
    }

    public void getTextEmployment() throws InterruptedException {
        clickElement("#comp-k2d3m6ja3bg");
        Thread.sleep(3000);
        getPageTitle(".font_0", "//p[@id='comp-k2d3m6ja3label']");
        Thread.sleep(3000);
    }

    public void getTextCourses() throws InterruptedException {
        clickElement("#comp-k2d3m6ja2bg");
        Thread.sleep(3000);
        getPageTitle(".font_0", "//p[@id='comp-k2d3m6ja2label']");
        Thread.sleep(3000);
    }

    public void getTextAboutUs() throws InterruptedException {
        clickElement("#comp-k2d3m6ja1");
        Thread.sleep(3000);
        getPageTitle(".font_0", "//p[@id='comp-k2d3m6ja1label']");
        Thread.sleep(3000);
    }
}
