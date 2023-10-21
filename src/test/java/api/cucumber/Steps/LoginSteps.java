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

public class LoginSteps {
//    private WebDriver driver = null;
//    @Given("user on login page")
//    public void user_on_login_page() {
//        WebDriverManager.chromedriver().setup();
//        driver  = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//    }
//    @When("user enter {string} and {string}")
//    public void user_enter_and(String username, String password) {
//        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//
//    }
//    @When("click on login button")
//    public void click_on_login_button() {
//        driver.findElement(By.xpath("//input[@id='login-button']")).click();
//        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MICROSECONDS);
//    }
//    @Then("if all right go to home otherwise give message")
//    public void if_all_right_go_to_home_otherwise_give_message() {
//        System.out.println(driver.getTitle());
//        String title = driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
//
//        Assert.assertEquals("Products",title);
//        driver.quit();
//
//    }


}
