package api.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPages {
    private WebDriver driver = null;
    private By text_username = By.id("user-name");
    private By text_password = By.id("password");
    private By loginButton = By.id("login-button");
    private By logoutbutton = By.xpath("//a[@id='logout_sidebar_link']");

    public LoginPages(WebDriver driver){
        this.driver = driver;
        if (!driver.getTitle().equals("Swag Labs")){
            throw new IllegalStateException("this is not login page. the current page is "+ driver.getCurrentUrl());
        }
    }

    public void enterusername(String Username){
        driver.findElement(text_username).sendKeys(Username);
    }

    public void enterpassword(String password){
        driver.findElement(text_password).sendKeys(password);
    }
    public void clickloginbutton(){
        driver.findElement(loginButton).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MICROSECONDS);
    }

    public boolean Checklogoutbutton(){
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MICROSECONDS);
        String text = driver.findElement(logoutbutton).getText();
        System.out.println(text);
        boolean displayed = driver.findElement(logoutbutton).isDisplayed();
        return displayed;
    }
}
