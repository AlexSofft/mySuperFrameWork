package mySuperCompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class API {

    public abstract WebDriver getDriver();


    public void login(String login, String pass){
        WebElement loginField = getDriver().findElement(By.id("mailbox:login"));
        loginField.clear();
        loginField.sendKeys(login);
        WebElement passwordField = getDriver().findElement(By.id("mailbox:password"));
        passwordField.clear();
        passwordField.sendKeys(pass);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// добавил бо не нажимал button
        WebElement loginButton = getDriver().findElement(By.xpath("//*[@id=\"mailbox:submit\"]/input"));
        loginButton.click();
    }

    public void logout(){
        (new WebDriverWait(getDriver(), 40))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#b-toolbar__left > div > div > div.b-toolbar__group.b-toolbar__group_left > div > a > span")));
        WebElement logoutButton = getDriver().findElement(By.cssSelector("#PH_logoutLink"));
        logoutButton.click();

    }
}
