package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:/selenium/WinDesktopApplication/src/test/java/feature/WinAppDriverAppl.feature",
		glue= {"stepdefwin"},
		
				
//plugin = ("json:target/cucumber-reports/CucumberTestReport.json"),
	plugin = {"pretty", "html:target/test-output"},
		tags= "@smoketest1"
		)
		/*tags= {"@SmokeTest1 or @SmokeTest2 or @SmokeTest3 or @SmokeTest4 or @SmokeTest5"}*/
		
		
public class Runner {

}
