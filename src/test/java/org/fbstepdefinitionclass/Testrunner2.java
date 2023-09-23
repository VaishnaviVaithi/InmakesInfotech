package org.fbstepdefinitionclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources" , glue = "org.fbstepdefinitionclass" , monochrome = true , dryRun = false,
strict = true , tags = "@Smoke")
public class Testrunner2 {

}
