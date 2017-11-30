package mySuperCompany;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GoogleTest extends BaseTest {


    @Test
    public void userLoginFail() {
       login("logintestqa", "false");
    }


    @Test
    public void userLogin() {
        login("logintestqa", "1qaz2wsx");
        logout();

    }

}
