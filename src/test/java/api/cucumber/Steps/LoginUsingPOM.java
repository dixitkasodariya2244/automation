package api.cucumber.Steps;

import api.cucumber.Pages.LoginPages;
import api.cucumber.Pages.Loginpage_PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginUsingPOM {
    WebDriver driver = null;
    Loginpage_PageFactory loginpage;
    @Given("user on login page")
    public void userOnLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MICROSECONDS);
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @When("user enter {string} and {string}")
    public void userEnterAnd(String username, String password) {
        loginpage = new Loginpage_PageFactory(driver);
        loginpage.enterusername(username);
        loginpage.enterpassword(password);
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        loginpage.clickloginbutton();
    }

    @Then("if all right go to home otherwise give message")
    public void ifAllRightGoToHomeOtherwiseGiveMessage() {
        Assert.assertTrue(loginpage.Checklogoutbutton());
        driver.quit();
    }
}
