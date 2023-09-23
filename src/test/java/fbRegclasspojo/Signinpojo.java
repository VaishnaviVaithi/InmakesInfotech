package fbRegclasspojo;

import org.fbstepdefinitionclass.Baseclass; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpojo extends Baseclass {

	public Signinpojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNew;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstname;

	@FindBy(name = "lastname")
	private WebElement secondname;

	@FindBy(name = "reg_email__")
	private WebElement emailbox;

	@FindBy(name = "reg_passwd__")
	private WebElement passwordbox;

	public WebElement getCreateNew() {
		return createNew;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSecondname() {
		return secondname;
	}

	public WebElement getEmailbox() {
		return emailbox;
	}

	public WebElement getPasswordbox() {
		return passwordbox;
	}

}
