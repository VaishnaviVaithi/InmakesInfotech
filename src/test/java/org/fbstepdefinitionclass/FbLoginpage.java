package org.fbstepdefinitionclass;

import org.pojodoc.FlipkartPage;
import org.stepdeffiledoc.BaseClass2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLoginpage extends BaseClass2 {
	
FlipkartPage f;
@Given("To launch the chrome browser and maximize the window")
public void to_launch_the_chrome_browser_and_maximize_the_window() {
    launchbrowser();
    WindowMaximize();
}

@When("To Launch the url of the Facebook Application")
public void to_Launch_the_url_of_the_Facebook_Application() {
    launchUrl("https://www.facebook.com/");
}

@When("To pass the valid username in email field")
public void to_pass_the_valid_username_in_email_field() {
    f = new FlipkartPage();
    passText("vvaishnavi850@gmail.com", f.getEmail());
}

@When("To pass the invalid password in password field")
public void to_pass_the_invalid_password_in_password_field() {
    f = new FlipkartPage();
    passText("123456", f.getPassword());
}

@When("To click the login button")
public void to_click_the_login_button() {
    f = new FlipkartPage();
    clickBtn(f.getLoginBtn());
}

@When("To check whether navigate to the homepage or not")
public void to_check_whether_navigate_to_the_homepage_or_not() {
    System.out.println("Check the Login Credentials");
}

@Then("To close the browser")
public void to_close_the_browser() {
	closeEntireBrowser();
}
}
