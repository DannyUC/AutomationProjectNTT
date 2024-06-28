package Actions;

import WebElements.LoginElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    private LoginElements elements;
    private Wait<WebDriver> waitTime;

    public Login(WebDriver driver){
        this.elements = new LoginElements(driver);
        waitTime = new WebDriverWait(driver, Duration.ofSeconds(10));
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String errorForbiddenAccess(){
        waitTime.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#errorForbiddenAccess")));
        return elements.errorForbiddenAccess().getText();
    }


}
