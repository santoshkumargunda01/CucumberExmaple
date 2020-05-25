package com.ivapp.pageobjects;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BasePage {

	public  static WebDriver driver;

	static Properties prop = new Properties();

	public WebDriver selectBrowser(String browser) {

		try {
			InputStream input = new FileInputStream("C:\\Santosh\\Cucumber\\cucumber-jvm-extentreport-master\\Config\\globalproperties.properties");
			prop.load(input);		

			if (prop.getProperty("browser").equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
			driver.get(prop.getProperty("url"));

		}catch (Exception e) {
			driver = null;
		}
		return driver;

	}



}
