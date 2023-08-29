package org.example.StepFiles;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("org/example")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")


public class loginDemoStep {
    ChromeDriver driver = new ChromeDriver();

    @Before
    public void browserSetup(){
        driver = new ChromeDriver();
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @Given("browser is open")
    public void browserIsOpen() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("username");
        driver.findElement(By.id("password")).sendKeys("password");
        Thread.sleep(3000);
    }


    @And("user is on login page")
    public void userIsOnLoginPage() {
        driver.findElement(By.id("login")).click();
    }

    @When("lser enters username and password")
    public void lserEntersUsernameAndPassword() {
    }

    @And("user clicks on login")
    public void userClicksOnLogin() {
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        driver.findElement(By.id("logout")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
