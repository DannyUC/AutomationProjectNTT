package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElements {

    private WebDriver driver; //instance local driver

    public LoginElements(WebDriver driver){
        this.driver=driver;
    }

    public WebElement registerButton(){
        return driver.findElement(By.xpath("//a[@class='navigation__link register']"));
    }

    public WebElement loginText(){
        return driver.findElement(By.xpath("//h2[contains(text(),'Login')]"));
    }

    public WebElement userEmail(){
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement userPassword(){
        return driver.findElement(By.id("userPassword"));
    }

    public WebElement loginButton(){
        return driver.findElement(By.id("submitButton"));
    }

}
