package Tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {
    WebDriver driver = new ChromeDriver();

    // here we create a map between a java method and a test
    @Given("^A user is on Demoqa\\.com$")
    public void a_user_is_on_Demoqa_com() throws Throwable {
//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");
    System.out.println("User is on Demoq.com");
    }

    @When("^user clicks on MyAccount link$")
    public void user_clicks_on_MyAccount_link() throws Throwable {
        driver.findElement(By.id("lst-ib")).sendKeys("Googling");
        driver.findElement(By.xpath("//body")).sendKeys(Keys.RETURN);
        driver.findElement(By.name("btnK")).click();


        System.out.println("User clicked on MyAccountLink");
    }

    @Then("^user is taken to login page$")
    public void user_is_taken_to_login_page() throws Throwable {
        System.out.println("User is taken to the login page");
    }

    @When("^user enters a valid username and password$")
    public void user_enters_a_valid_username_and_password() throws Throwable {
        System.out.println("User enters valid username and password");
    }

    @Then("^user is able to login successfully$")
    public void user_is_able_to_login_successfully() throws Throwable {
        System.out.println("User is able to login successfully");
    }

    @Given("^A user is on ToolsQA login page$")
    public void a_user_is_on_ToolsQA_login_page() throws Throwable {
        System.out.println("User is on Demoq.com");
    }

}
