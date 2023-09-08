package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adactin_page01 {
	
	
	
public   WebDriver driver;
	
	
	@FindBy(xpath = "//input[@type='text']")
	private static WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	private static WebElement password;

	@FindBy(xpath = "//input[@type='Submit']")
	private static WebElement login;
	
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
	
	
	public adactin_page01(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	}


}
	
	
	


