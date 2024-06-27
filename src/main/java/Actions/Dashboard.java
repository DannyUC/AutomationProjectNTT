package Actions;

import WebElements.DashboardElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {

    private DashboardElements elements;

    public Dashboard(WebDriver driver){
        this.elements = new DashboardElements(driver);
    }

    public String getUserName(){
        return elements.userNameDisplay().getText();
    }

    public void trainingTab(){
        elements.trainingTab().click();
    }

}
