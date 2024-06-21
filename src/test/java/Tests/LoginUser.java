package Tests;

import Actions.Dashboard;
import Actions.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

import java.time.Duration;

public class LoginUser extends BaseTest {

    private Login login = null;
    private Dashboard dashboard = null;

    @Test
    public void loginUser() {
        initTest("Login User");
        String email = "dani@gmail.com";
        driver.get("http://apptest.go.ro:9999/login");

        WebDriverWait waitTime = new WebDriverWait(driver,Duration.ofSeconds(10));

        login = new Login(driver);
        dashboard = new Dashboard(driver);

        login.setEmail(email);
        login.setPassword("090909");
        login.loginButton();

        waitTime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='navigation__link userName']")));

        Assert.assertEquals(dashboard.getUserName(),email);

    }
}
