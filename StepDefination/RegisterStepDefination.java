package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.Callable;

public class RegisterStepDefination {
    WebDriver driver;

    @Given("^user able to open browser$")
    public void user_able_to_open_browser() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Given("^enter url$")
    public void enter_url() {
        driver.get("https://demo.nopcommerce.com/");

    }

    @Then("^user click on Register Link$")
    public void user_click_on_Register_Link() {
        driver.findElement(By.className("ico-register")).click();

    }

    @Then("^user on Register page and verify Register title$")
    public void user_on_Register_page_and_verify_Register_title() {
        driver.findElement(By.className("html-registration-page")).click();


    }

    @When("^use username and password and click on Register button$")
    public void use_username_and_password_and_click_on_Register_button() {
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys();
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys();


    }

    @Then("^user is on Register page$")
    public void user_is_on_Register_page() {
        driver.quit();

    }


}