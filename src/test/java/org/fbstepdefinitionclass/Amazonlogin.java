package org.fbstepdefinitionclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fbRegclasspojo.Amazpojo;

public class Amazonlogin extends Baseclass {

	Amazpojo a;

	@When("To pass the mobile number in number textbox")
	public void to_pass_the_mobile_number_in_number_textbox() {
		a = new Amazpojo();
		passText("vvaishnavi850@gmail.com", a.getMobileno());
	}

	@When("To pass the password in password textbox")
	public void to_pass_the_password_in_password_textbox() {
		a = new Amazpojo();
		passText("Vvaishtom@1345", a.getPassword());
	}

	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchbrowser();
		WindowMaximize();
	}

	@When("User has to hit the amazon Url")
	public void user_has_to_hit_the_amazon_Url() {
		launchUrl("https://www.amazon.com/");
	}

	@When("To click login button")
	public void to_click_login_button() throws InterruptedException {
		a = new Amazpojo();
		clickBtn(a.getLogin());
		Thread.sleep(3000);
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		a = new Amazpojo();
		clickBtn(a.getCreatenew());
	}

	@When("To pass the name in yourname textbox")
	public void to_pass_the_name_in_yourname_textbox() {
		a = new Amazpojo();
		passText("Vaishnavi", a.getName());
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		a = new Amazpojo();
		passText(em, a.getMobileno());
	}

	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) throws InterruptedException {
		a = new Amazpojo();
		passText(pass, a.getPassword());
		Thread.sleep(3000);
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	}
}
