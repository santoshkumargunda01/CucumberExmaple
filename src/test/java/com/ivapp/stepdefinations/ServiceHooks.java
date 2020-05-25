package com.ivapp.stepdefinations;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.ivapp.pageobjects.BasePage;
import com.ivapp.pageobjects.Browsers;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class ServiceHooks {

	BasePage pageBase;
	WebDriver driver;
	
	@Before
	public void initializeTest() {
		pageBase = new BasePage();
		pageBase.selectBrowser(Browsers.CHROME.name());

		
	}

	@After
	public void endTest(Scenario scenario) {
		if (scenario.isFailed()) {

			try {
				final byte[] screenshot = ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png"); // ... and embed it in
			} catch (WebDriverException e) {
				e.printStackTrace();
			}

		} else {
			try {
				scenario.embed(((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.BYTES), "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		BasePage.driver.quit();
	}
}
