package Actions;

import WebElements.LoginElements;
import WebElements.RegisterElements;
import org.openqa.selenium.WebDriver;

public class Register {

    private RegisterElements elements;

    public Register(WebDriver driver){
        this.elements = new RegisterElements(driver);
    }

    public String getSignUpText(){
        return elements.signUpText().getText();
    }

    public void setFirstName(String firstName){
        elements.firstName().sendKeys(firstName);
    }

    public void setLastName(String lastName){
        elements.lastName().sendKeys(lastName);
    }

    public void setPhoneNumber(String phoneNumber){
        elements.phoneNumber().sendKeys(phoneNumber);
    }

    public void setEmail(String email){
        elements.email().sendKeys(email);
    }

    public void setPassword(String password){
        elements.password().sendKeys(password);
    }

    public void setCity(String city){
        elements.city().sendKeys(city);
    }

    public void checkCustomer(){
        elements.customer().click();
    }

    public void checkTrainer(){
        elements.trainer().click();
    }

    public void signUp(){
        elements.signUp().click();
    }


}
