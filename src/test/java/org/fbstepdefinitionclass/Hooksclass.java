package org.fbstepdefinitionclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass extends Baseclass  {
	@Before
	private void precondition() {
		launchbrowser();
		WindowMaximize();
	}
	
	@After
	private void postcondition() {
		closeEntireBrowser();
	}
}
