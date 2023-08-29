package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_login {
    @FindBy(id = "name")
    WebElement txt_username;
    @FindBy(id = "password")
    WebElement txt_password;
    @FindBy(id = "login")
    WebElement btn_login;

    ChromeDriver driver = new ChromeDriver();

    public PF_login(ChromeDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }
    public void enterpassword(String password){
        txt_password.sendKeys(password);
    }
    public void clickOnLogin(){
        btn_login.click();
    }
}


