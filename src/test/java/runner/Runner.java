package runner;

import org.junit.runner.RunWith;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", dryRun = true , tags = "@todos", glue = "steps", plugin = { "pretty",
				"html:target/cucumber", "json:target/cucumber.json" })
public class Runner extends Drivers {

}