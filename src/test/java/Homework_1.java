import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework_1 {
        WebDriver driver;
        @BeforeMethod
        public void setUp(){
            driver = new ChromeDriver();
        }


        @Test
        public void openWikipediaTest() throws InterruptedException {
            driver.get("https://www.wikipedia.org/");
            Thread.sleep(5000);

            driver.findElement(By.id("js-link-box-en")).click();
            driver.findElement(By.id("pt-login")).click();
            driver.findElement(By.id("wpName1")).click();
            driver.findElement(By.id("wpName1")).clear();
            driver.findElement(By.id("wpName1")).sendKeys("matvey.telran");
            driver.findElement(By.id("wpPassword1")).click();
            driver.findElement(By.id("wpPassword1")).clear();
            driver.findElement(By.id("wpPassword1")).sendKeys("a0Z7%0F5");
            driver.findElement(By.id("wpLoginAttempt")).click();
            Thread.sleep(5000);

        }


        @AfterMethod
        public void tearDown(){
            driver.quit();
        }


    }


