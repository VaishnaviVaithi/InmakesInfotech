package org.fbstepdefinitionclass;

import io.cucumber.datatable.*; 

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fbRegclasspojo.Signinpojo;

public class fbregclass extends Baseclass {

	Signinpojo s;

	@Given("to launch  the  browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchbrowser();
		WindowMaximize();
	}

	@When("To launch the url of Facebook application")
	public void to_launch_the_url_of_Facebook_application() {
		launchUrl("https://www.facebook.com/");
	}

	@When("To click the create account button")
	public void to_click_the_create_account_button() throws InterruptedException {
		s = new Signinpojo();
		clickBtn(s.getCreateNew());
		Thread.sleep(3000);
	}

	@When("To pass the firstname in firstname textbox")
	public void to_pass_the_firstname_in_firstname_textbox() throws InterruptedException {
		Thread.sleep(2000);
		s = new Signinpojo();
		passText("vaishnavi", s.getFirstname());
	}

	@When("To pass the secondname in secondname textbox")
	public void to_pass_the_secondname_in_secondname_textbox() {
		s = new Signinpojo();
		passText("Private Limited", s.getSecondname());
	}

	@When("To pass the mobilenumber or email in email textbox")
	public void to_pass_the_mobilenumber_or_email_in_email_textbox() {
		s = new Signinpojo();
		passText("vvaishnavi850@gmail.com", s.getEmailbox());
	}

	@When("To create the new Password using new password textbox")
	public void to_create_the_new_Password_using_new_password_textbox() {
		s = new Signinpojo();
		passText("Vvaishu@183", s.getPasswordbox());
	}

	@Then("To close the chromebrowser")
	public void to_close_the_chromebrowser() {
		closeEntireBrowser();
	}
}
