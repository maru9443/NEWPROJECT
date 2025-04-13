package testrunners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"@target/failedrerun.txt"},
                 glue={"StepDefinitions","AppHooks"},
                 monochrome=true,
                 dryRun=false,
                 publish=false,
                 plugin= {"pretty",
                		  
                		 }
			
		)

public class FailedRunner  {
	

}
//"rerun:target/failedrerun.txt"