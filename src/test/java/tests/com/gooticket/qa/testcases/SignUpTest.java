package com.gooticket.qa.testcases;

import com.gooticket.qa.pages.HomePage;
import com.gooticket.qa.pages.LoginPage;

public class SignUpTest {
	SignUp  SignUpPage;
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	public SignUpTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();	
		SignUp = new SignUpPage();
	
	}	
	
	@Test(priority=1)
	public void verifySignPageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Gotickets.com","SignUP page title not matched");
	}
	
	@Test(priority=2)
	public void clickOnMyAccount(){
		LoginPage = SignUp.clickOnRegisterButton();
	}	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
