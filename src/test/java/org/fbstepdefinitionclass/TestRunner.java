package org.fbstepdefinitionclass;

import org.junit.runner.RunWith; 

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources" , glue = "org.fbstepdefinitionclass" , monochrome = true ,snippets = SnippetType.CAMELCASE , dryRun = false , strict = true)
public class TestRunner {

}
