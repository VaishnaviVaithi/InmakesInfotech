package fbRegclasspojo;

import org.fbstepdefinitionclass.Baseclass; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FlipkartPage extends Baseclass {

	public FlipkartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement email;

	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginBtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	
}
