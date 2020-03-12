package com.gooticket.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.util.TestUtil;
import com.gooticket.qa.pages.HomePage;
import com.gooticket.qa.pages.LoginPage;

public class HomePageTest extends ConfigTestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();	
		loginPage = new LoginPage();
	
	}	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Buy official Formula 1, MotoGP and more Sports Tickets | Gootickets","Home page title not matched");
	}
	
	@Test(priority=2)
	public void clickOnMyAccount(){
		testUtil.switchToFrame();
		LoginPage = homePage.clickOnMyAccount();
	}	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
