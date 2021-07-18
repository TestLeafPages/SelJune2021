package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDef.BaseClass;


@CucumberOptions(features = {"src/test/java/features"}, 
				glue = "stepDef", 
				monochrome = true, 
				publish =true,
				//tags = "@functional" // to execute only regression scenarios
				//tags = "@smoke or @regression" // to execute all the smoke or regression scenarios
				//tags = "@regression and @functional" // to execute scenarios having both regression and functional tags
				tags = "not @functional" // execute all the scenarios except functional
				
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
