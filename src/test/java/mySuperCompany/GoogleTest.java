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

    public void login(String login, String pass){
        WebElement loginField = driver.findElement(By.id("mailbox:login"));
        loginField.clear();
        loginField.sendKeys(login);
        WebElement passwordField = driver.findElement(By.id("mailbox:password"));
        passwordField.clear();
        passwordField.sendKeys(pass);
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"mailbox:submit\"]/input"));
        loginButton.click();
    }

    public void logout(){
        (new WebDriverWait(driver, 40))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#b-toolbar__left > div > div > div.b-toolbar__group.b-toolbar__group_left > div > a > span")));
        WebElement logoutButton = driver.findElement(By.cssSelector("#PH_logoutLink"));
        logoutButton.click();
        //finish
    }



}
