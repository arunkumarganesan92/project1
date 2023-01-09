package org.cucumber_task;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\TestNG\\CucumberTask\\src\\test\\resources\\purchase.feature",
					glue = "org.cucumber_task",
					dryRun = false,
					plugin = "html:target/report"
					)

public class Runner {

}
//  C:\TestNG\CucumberTask\src\test\resources\purchase.feature