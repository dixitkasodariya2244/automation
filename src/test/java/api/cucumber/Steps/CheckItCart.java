package api.cucumber.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckItCart {
    private WebDriver driver = null;
//    private WebDriver driver = null;
//    @Given("user enter {string} and {string} and click on login button")
//    public void userEnterAndAndClickOnLoginButton(String username, String password) {
//        WebDriverManager.chromedriver().setup();
//        driver  = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//        driver.findElement(By.xpath("//input[@id='login-button']")).click();
//        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MICROSECONDS);
//
//    }
//

    @When("user enter homepage and click add to cart")
    public void userEnterHomepageAndClickAddToCart() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
    }

    @And("user check how many iteam on cart")
    public void userCheckHowManyIteamOnCart() {
    }

    @Then("it is not same then give error")
    public void itIsNotSameThenGiveError() {
        String numberofcartIteams = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).getText();
        Assert.assertEquals("2",numberofcartIteams);
        driver.quit();
    }
}
