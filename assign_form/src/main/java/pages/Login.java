package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage{

    public Login(WebDriver webDriver) {
        super(webDriver);
    }
    By usernameElement = By.name("username");
    By passwordElement = By.name("password");
    By loginButtonElement = By.xpath("//button[@type='submit']");

    public void login(String name , String password){
       enterUserName(name);
        enterPassword(password);
       clickOnLoginButton();

    }
    public void enterUserName(String name ){
        enterData(usernameElement,name);
    }
    public void enterPassword(String password){
        enterData(passwordElement,password);
    }
    public void clickOnLoginButton(){
        clickOnButton(loginButtonElement);
    }

}
