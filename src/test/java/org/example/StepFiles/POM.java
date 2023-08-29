package org.example.StepFiles;
import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class POM {
    loginPage login;
    WebDriver driver= null;
    @Given("Browser is open")
    public void browserIsOpen() {
        System.out.println("In_browser");
        System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/Downloads/Chrome");
        driver= new ChromeDriver();


    }

    @And("User is on login page")
    public void userIsOnLoginPage() {

        driver.navigate().to("https://example.testproject.io/web/");

    }

    @When("user enters (.*) and (.*)$")
    public void userEntersUnameAndPass(String Uname, String pass) {


//        login = new loginPage(driver);
//        login.enterUsername(Uname);
//        login.enterPassword(pass);
    }


    @And("User clicks on login")
    public void userClicksOnLogin() {
        login.Clicklogin();
    }

    @Then("User is navigated to the login page")
    public void userIsNavigatedToTheLoginPage() {
       login.checkLogOutIsDisplayed();

    }
}
