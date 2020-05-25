package com.ivapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;	
	
	@FindBy(xpath="//input[@name='userName']")
	public WebElement txtUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='login']")
	public WebElement btnLogin;
	
	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	public void enterUserName(String userName){
		this.txtUserName.sendKeys(userName);
	}
	
	public void enterPassword(String password){
		this.txtPassword.sendKeys(password);
	}
	
	public void clickLoginButton(){
		btnLogin.click();
	}

}
