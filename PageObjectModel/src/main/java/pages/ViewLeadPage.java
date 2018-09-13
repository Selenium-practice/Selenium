package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers{
	
	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}		
	}	
			
	public LoginPage clickOnCreateLead(){
		clickByLink("Create Lead");
		return new LoginPage(driver, test);		
	}

}











