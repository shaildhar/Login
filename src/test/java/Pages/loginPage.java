package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
    ChromeDriver driver = new ChromeDriver();
    By txt_username= By.id("name");
    By txt_password = By.id("password");
    By txt_login = By.id("login");
    By txt_logout = By.id("logout");

    public loginPage(ChromeDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void Clicklogin(){
     driver.findElement(txt_login).click();
    }
    public void checkLogOutIsDisplayed(){
        driver.findElement(txt_logout).isDisplayed();
    }

}

