package mindtree.BDDBigSmall.runnerClass;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "features", glue = "mindtree.BDDBigSmall.StepDefinitions", dryRun = false)
public class TestRunnerClass extends AbstractTestNGCucumberTests {

}
