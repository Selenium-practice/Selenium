package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_MergeLead extends LeafTapsWrappers{
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Merge Lead";
		testDescription ="Merge lead for future purpose";
		category = "Sanity";
		authors = "Manimaran";
		browserName = "chrome";
		dataSheetName = "TC004";
	}	
	
	@Test(dataProvider = "fetchData")
	public void createlead(String uName, String pwd,String FN,String FN1) throws InterruptedException{
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickOnCRMSFA()
		.clickOnLead()
		.clickOnMergeLead()
		.clickOnFromLead()
	    .switchToMergeLeadLastWindow()
	    .enterByFromLeadFirstName(FN)
	    .clickOnFindLeads()
	    .clickOnLeadList()
	    .switchToMergeLeadParentWindow()
	    .clickOnToLead()
	    .switchToMergeLeadLastWindow()
	    .enterByToLeadFirstName(FN1)
	    .clickOnFindLeads()
	    .clickOnLeadList()
	    .switchToMergeLeadParentWindow()
	    .clickOnMergeButton()
	    .handleAlertAccept();
	  
	    
	    			
	}

}
