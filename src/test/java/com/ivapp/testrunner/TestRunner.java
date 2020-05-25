package com.ivapp.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.ExtentReporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        tags = {"@successful"},
        glue = {"com/ivapp/stepdefinations"},
        snippets = SnippetType.CAMELCASE
        //plugin = {"html:output/html-report", "com.reports.ExtentFormatter:output/extent-report/index.html"}
)
public class TestRunner {

    @AfterClass
    public static void setup() {
        //ExtentReporter.setConfig("src/test/resources/config.xml");
       // ExtentReporter.setSystemInfo("Browser", "Chrome");
        //ExtentReporter.setSystemInfo("Selenium", "v2.53.1");
    }

}
