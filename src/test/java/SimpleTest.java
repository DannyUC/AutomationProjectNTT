import Actions.SimpleActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

public class SimpleTest extends BaseTest {
    @Test
    public void firstTest(){

        initTest("SampleTest");
        driver.get("http://apptest.go.ro:9999/login");

        String expectedText = "Login";
        SimpleActions simpleActions = new SimpleActions(driver);
        String loginText = simpleActions.getLoginText();

        Assert.assertEquals(loginText,expectedText.toLowerCase());
    }

}
