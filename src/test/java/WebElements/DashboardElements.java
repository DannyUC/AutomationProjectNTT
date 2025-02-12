package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardElements {

    private WebDriver driver; //instance local driver

    public DashboardElements(WebDriver driver){
        this.driver=driver;
    }

    public WebElement userNameDisplay(){
        return driver.findElement(By.xpath("//a[@class='navigation__link userName']"));
    }

    public WebElement trainingTab(){
        return driver.findElement(By.xpath("//a[@class='navigation__link trainings']"));
    }
}
