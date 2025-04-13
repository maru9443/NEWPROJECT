package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",
                 glue={"StepDefinitions","AppHooks"},
                 monochrome=true,
                 dryRun=false,
                 publish=true,
                 tags="@RegressionTesting",
                 plugin= {"pretty",
                		 
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		 "json:target/JsonReports/report.json",
                		 "html:target/HTMLReports/report.html",
                		 "junit:target/XMLReports/report.xml",
                		 "rerun:target/failedrerun.txt"}
			
		)

public class MyTestRunner {

}
