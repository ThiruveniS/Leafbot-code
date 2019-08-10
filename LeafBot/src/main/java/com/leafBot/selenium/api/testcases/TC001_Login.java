package com.leafBot.selenium.api.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;
//import com.leaftaps.leads.pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethods {
	
	
	@BeforeTest
	public void setData() {
		
		testcaseName = "Login";
		testcaseDec = "Leaftap Login";
		author = "Thiru";
		category = "Sanity" ;
		excelFileName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String data,String value) {
		
		new LoginPage().enterUsername(data).enterPassword(value).clickLogin();
		
}
}

