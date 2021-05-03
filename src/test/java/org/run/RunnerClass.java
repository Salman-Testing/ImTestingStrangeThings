package org.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith (Cucumber.class)
@CucumberOptions (features="src\\test\\resources",glue="org.steps",dryRun=false
,monochrome=true
,strict=true,snippets=SnippetType.CAMELCASE, tags= {"@Sanity"},
plugin= {"html:C:\\Users\\salma\\eclipse-workspace\\CucumberProject8AM\\REPORTS\\HTMLFolder",
		"json:C:\\Users\\salma\\eclipse-workspace\\CucumberProject8AM\\REPORTS\\JSONFolder\\JsonReport.json",
		"junit:C:\\Users\\salma\\eclipse-workspace\\CucumberProject8AM\\REPORTS\\JUNITFolder\\JunitReport.xml"})
public class RunnerClass {

}
