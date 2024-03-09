import org.globallib.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userName;

	

	public WebElement getUserName() {
		return userName;
	}
	
	
	public void getData()
	{
		sendKeys(getUserName(), "Arun");
		refresh();
		sendKeys(getUserName(), "kumar");
	}
}
