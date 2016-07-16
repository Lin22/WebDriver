import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jv on 16/07/2016.
 */
public class AfterPage {

	@FindBy(xpath=".//*[@id='PH_user-email']")
	private WebElement assertElement;


    public AfterPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String getAssertElementText(){
        return assertElement.getText();
    }
}
