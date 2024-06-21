package Actions;

import WebElements.LoginElements;
import org.openqa.selenium.WebDriver;

public class Login {
    private LoginElements elements;

    public Login(WebDriver driver){
        this.elements = new LoginElements(driver);
    }

    public void clickRegisterButton(){
        elements.registerButton().click();
    }

    public String getLoginText(){
        return elements.loginText().getText();
    }

    public void setEmail(String email){
        elements.userEmail().sendKeys(email);
    }

    public void setPassword(String password){
        elements.userPassword().sendKeys(password);
    }

    public void loginButton(){
        elements.loginButton().click();
    }

}
