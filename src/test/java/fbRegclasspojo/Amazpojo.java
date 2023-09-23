package fbRegclasspojo;

import org.fbstepdefinitionclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazpojo extends Baseclass {
  public Amazpojo() {
	PageFactory.initElements(driver, this);
  }
  @FindBy(xpath = "//a[@id='nav-link-accountList']")
  private WebElement login;
  
  @FindBy(xpath = "//a[@class='a-button-text']")
  private WebElement createnew;
  
  @FindBy(xpath = "//input[@name='customerName']")
  private WebElement name ;
  

  @FindBy(xpath = "//input[@aria-label='Mobile number or email']")
  private WebElement mobileno;
  

  @FindBy(xpath = " (//input[@name='password'])[1]")
  private WebElement password;


public WebElement getLogin() {
	return login;
}


public WebElement getCreatenew() {
	return createnew;
}


public WebElement getName() {
	return name;
}


public WebElement getMobileno() {
	return mobileno;
}


public WebElement getPassword() {
	return password;
}
  
}
 