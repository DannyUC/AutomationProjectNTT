package Actions;

import WebElements.DashboardElements;
import WebElements.TrainingElements;
import org.openqa.selenium.WebDriver;

public class Training {
    private TrainingElements elements;

    public Training(WebDriver driver){
        this.elements = new TrainingElements(driver);
    }

    public String getTrainingTitle(){
        return elements.trainingProgramTitle().getText();
    }
}
