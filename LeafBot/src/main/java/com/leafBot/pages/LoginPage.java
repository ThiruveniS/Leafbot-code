package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

//import com.leaftaps.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage() { // Pagefactory code
	}

	public LoginPage enterUsername(String data) {
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement ele = locateElement("id", "username");
		
		clearAndType(ele, data);
		return this;
	}

	public LoginPage enterPassword(String value) {
	//driver.findElementById("password").sendKeys("crmsfa");
		WebElement ele = locateElement("id", "password");
		clearAndType(ele, value);
		return this;
	}

	public HomePage clickLogin() {
		
		//driver.findElementByClassName("decorativeSubmit").click();
		/*
		 * HomePage page = new HomePage(); return page;
		 */
		WebElement ele = locateElement("className", "decorativeSubmit");
		click(ele);
		return new HomePage();
	}

}
