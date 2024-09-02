package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 
@RunWith(Cucumber.class)
@CucumberOptions(features =  "C:\\Users\\Administrator\\Documents\\Testing course\\SeleniumJava\\CucumberJava\\CucumberTags\\src\\main\\resources\\DemoGoogle\\google.feature" , 
				 glue = "google", 
				 dryRun = true,
				 plugin = {"pretty", 
						   "html:test-output",
						   "json:target/cucumber.json",
		  				   "junit:junit_xml/cucumber.xml" }
               )


public class GoogleRunner {

}
