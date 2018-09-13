package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers{
	
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}		
	}	
			
	public MergeLeadPage clickOnFromLead(){
		clickByXpath("(//img[@alt='Lookup'])[1]");
		return this;
			}

	public FindLeadPage switchToMergeLeadLastWindow(){
		switchToLastWindow();
		return new FindLeadPage(driver, test);
}
	public MergeLeadPage clickOnToLead(){
		clickByXpath("(//img[@alt='Lookup'])[2]");
		return this;
			}
	
	public MergeLeadPage clickOnMergeButton(){
		clickByLinkNoSnap("Merge");
		return this;
			}
	public void handleAlertAccept()
	{
		acceptAlert();
	}
	
	
	
}











