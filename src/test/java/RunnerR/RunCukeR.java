package RunnerR;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		plugin = { "json:target/cucumber.json", "pretty", "html:target/cucumber.html" },

		features = "./src/test/Feature_FilesR", glue ="StepDefnitionsR", monochrome = true,
		strict=true
      , tags={"@CreateUser"}

)

public class RunCukeR extends AbstractTestNGCucumberTests{
	
	

}
