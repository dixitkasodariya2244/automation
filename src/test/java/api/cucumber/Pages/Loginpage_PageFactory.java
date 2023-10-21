package api.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.concurrent.TimeUnit;

public class Loginpage_PageFactory {
    private WebDriver driver = null;
    @FindBy(id = "user-name")
    @CacheLookup
    private WebElement username ;

    @FindBy(id = "password")
    @CacheLookup
    private  WebElement password;

//    @FindBy(id = "login-button")
    @FindBy(how = How.ID,using = "login-button")
    @CacheLookup
    private WebElement loginbutton;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    @CacheLookup
    private WebElement logouttext;

    public Loginpage_PageFactory(WebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,5);
        PageFactory.initElements(factory,this);
        if (!driver.getTitle().equals("Swag Labs")){
            throw new IllegalStateException("this is not login page. the current page is "+ driver.getCurrentUrl());
        }
    }
    public void enterusername(String Username){
        username.sendKeys(Username);
    }

    public void enterpassword(String password){
        this.password.sendKeys(password);
    }
    public void clickloginbutton(){
       loginbutton.click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MICROSECONDS);
    }

    public boolean Checklogoutbutton(){
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MICROSECONDS);
        boolean displayed = logouttext.isDisplayed();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MICROSECONDS);
        return displayed;

    }
}
