package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/main/resources/FeaturesWithTags/TagsDemo.feature",
		 glue= {"steps"},
		 dryRun=true,	
	    // tags="@smoke"
		// tags="@regression"
		// tags="@smoke or @regression"
		// tags="@smoke and @regression"
		 //tags="(@smoke or @regression) and @End2End"
		// tags="@regression  and not @smoke"
		 tags="(@smoke or @regression) and not @End2End"
		)


public class RunnerClass {
	

}
