package Actions;


import WebElements.RegisterElements;
import org.openqa.selenium.WebDriver;
import utile.ConfigLoader;

public class Register {

    private RegisterElements elements;
    private ConfigLoader configLoader;

    public Register(WebDriver driver) {
        this.elements = new RegisterElements(driver);
    }

    public String getSignUpText() {
        return elements.signUpText().getText();
    }

    public void setFirstName(String firstName) {
        elements.firstName().sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        elements.lastName().sendKeys(lastName);
    }

    public void setPhoneNumber(String phoneNumber) {
        elements.phoneNumber().sendKeys(phoneNumber);
    }

    public void setEmail(String email) {
        elements.email().sendKeys(email);
    }

    public void setPassword(String password) {
        elements.password().sendKeys(password);
    }

    public void setCity(String city) {
        elements.city().sendKeys(city);
    }

    public void checkCustomer() {
        elements.customer().click();
    }

    public void checkTrainer() {
        elements.trainer().click();
    }

    public void signUp() {
        elements.signUp().click();
    }

    public void registerUser(boolean isTrainer) {

        configLoader = new ConfigLoader("src/test/resources/proprietati/dateUser.properties");
        String firstName = configLoader.getProperty("firstName");
        String lastName = configLoader.getProperty("lastName");
        String phoneNumber = configLoader.getProperty("phoneNumber");
        String email = configLoader.getProperty("email");
        String password = configLoader.getProperty("password");
        String city = configLoader.getProperty("city");

        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setPassword(password);
        setCity(city);
        if (isTrainer) {
            checkTrainer();
        } else {
            checkCustomer();
        }
        signUp();
    }
}

