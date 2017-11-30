package mySuperCompany;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest extends API {

    protected static WebDriver driver;

    @Override
    public WebDriver getDriver() {
        return driver;
    }
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ru/");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }


}
