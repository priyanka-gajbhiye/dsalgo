package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/reports/login.html" }, //reporting purpose
		monochrome=false,  //console output color
		//tags = "@Check_login", //tags from feature file
		features = {"src/test/resources/features"}, //location of feature files
		glue= {"Step_definition","applicationHooks"}) //location of step definition files


public class Test_runner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }

}
