package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\Resource\\ResultPage.feature",
plugin = {"html:target/cucumber-report",
           "json:target/cucumer-json-report.json" }
           )

public class RunCukeTest {
}
//pushing dev

//chirag push
//pushing chirag

