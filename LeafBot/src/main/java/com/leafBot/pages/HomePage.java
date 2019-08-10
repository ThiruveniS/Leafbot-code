package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

//import com.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage() { // Pagefactory code
	}
	public HomePage clickLogout()
	{
		System.out.println("login done");
		return this;
		//driver.findElementByLinkText("CRM/SFA").click();
		//return new LoginPage();
	}

	/*public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}*/
}
