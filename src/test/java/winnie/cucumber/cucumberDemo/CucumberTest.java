package winnie.cucumber.cucumberDemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report;","json:target/cucumber.json" }
,features={"src/test/resources/features/"},glue={"winnie.cucumber.cucumberDemo"})

public class CucumberTest {

}
