package Tests;

import Actions.Dashboard;
import Actions.Login;
import Actions.Register;
import Actions.Training;
import WebElements.LoginElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

import java.time.Duration;

public class TrainingProgram extends BaseTest {

    private Login login = null;
    private Dashboard dashboard = null;
    private Register register = null;
    private RegisterUser registerUser = null;
    private Training training = null;

    @Test
    public void openTrainingTab() {

        initTest("Open Training Tab");

        login = new Login(driver);
        dashboard = new Dashboard(driver);
        register = new Register(driver);
        registerUser = new RegisterUser();
        training = new Training(driver);


        WebDriverWait waitTime = new WebDriverWait(driver, Duration.ofSeconds(10));

        login();
        waitTime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='navigation__link userName']")));

        Assert.assertEquals(dashboard.getUserName(), "hsaiudhsa@sdj.com");

        dashboard.trainingTab();

        Assert.assertEquals(training.getTrainingTitle(), "Training program");

    }

    private void login() {
        WebDriverWait waitTime = new WebDriverWait(driver, Duration.ofSeconds(5));

        login.setEmail("hsaiudhsa@sdj.com");
        login.setPassword("2342");
        login.loginButton();

        if (driver.getCurrentUrl().contains("apptest.go.ro:9999/login")) {
            waitTime.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#errorForbiddenAccess")));
            if (login.errorForbiddenAccess().equalsIgnoreCase("Access forbidden!")) {
                login.clickRegisterButton();
                register.registerUser(true);
            }
        }
    }

}
