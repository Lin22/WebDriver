import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by jv on 16/07/2016.
 */
public class LoginTest {
    WebDriver driver;
    LoginPage loginpage;
    String url="https://mail.ru";



    @BeforeClass
    public void setUp() throws Exception {
        driver=new FirefoxDriver();
        loginpage=new LoginPage(driver);
        driver.get(url);




    }

    @Test
    public void testLogin() throws Exception {
        String actual=loginpage.login("_lin","123654eli").getAssertElementText();
        String expected="_lin@mail.ru";


        Assert.assertEquals(actual,expected);

    }

}
