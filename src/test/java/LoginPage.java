import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jv on 16/07/2016.
 */
public class LoginPage {
    private final WebDriver driver;
    @FindBy(id="mailbox__login")
	private WebElement loginField;

    @FindBy(id="mailbox__password")
    private WebElement passwordField;

    @FindBy(id="mailbox__auth__button")
    private WebElement button;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public AfterPage login(String login, String password) throws InterruptedException {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        button.click();
        Thread.sleep(5000);


        return new AfterPage(driver);
    }
}
