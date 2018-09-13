package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers{
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Create Lead";
		testDescription ="Create lead for future purpose";
		category = "Smoke";
		authors = "Mani";
		browserName = "chrome";
		dataSheetName = "TC003";
	}	
	
	@Test(dataProvider = "fetchData")
	public void createlead(String uName, String pwd,String CN,String FN,String LN,String EM,String MO){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickOnCRMSFA()
		.clickOnLead()
		.clickOnCreateLead()	
		.enterByCompanyName(CN)
		.enterByFirstName(FN)
		.enterByLastName(LN)
		.enterByEmail(EM)
		.enterBymobilenumber(MO)
		.clickByCreateLead();
		
		
		
		
		
		
		
			
	}

}
