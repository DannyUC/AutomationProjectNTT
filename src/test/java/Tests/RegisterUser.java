package Tests;

import Actions.Login;
import Actions.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

import java.time.Duration;

public class RegisterUser extends BaseTest {

    private Login login = null;
    private Register register = null;

    @Test
    public void registerUser() {
        initTest("Register User");

        WebDriverWait waitTime = new WebDriverWait(driver, Duration.ofSeconds(10));
        login = new Login(driver);
        register = new Register(driver);

        login.clickRegisterButton();

        Assert.assertTrue(register.getSignUpText().equalsIgnoreCase("Sign Up"));

        register.registerUser(true);

        waitTime.until(ExpectedConditions.invisibilityOfElementLocated(By.id("submit")));

        Assert.assertTrue(login.getLoginText().equalsIgnoreCase("Login"));
    }
}
