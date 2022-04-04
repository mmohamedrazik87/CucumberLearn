package runner;

import StepDefinition.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/main/java/featureFile/createleadwithDynamicTestData.feature",
glue ="StepDefinition", publish = true,monochrome=true,
//tags ="@regression",
//tags="@regression and smoke",
//tags="regression or smoke".,
tags="not @smoke")
public class testRun extends BaseClass{

}
