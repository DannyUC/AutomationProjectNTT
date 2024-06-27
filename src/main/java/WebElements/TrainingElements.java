package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrainingElements {

    private WebDriver driver; //instance local driver

    public TrainingElements(WebDriver driver){
        this.driver=driver;
    }

    public WebElement trainingProgramTitle(){
        return driver.findElement(By.xpath("//div[@class='example-container']/h2[contains(text(),'Training program')]"));
    }
}
