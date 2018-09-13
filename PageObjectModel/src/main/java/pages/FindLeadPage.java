package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadPage extends LeafTapsWrappers {

	public FindLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Find Leads")) {
			reportStep("This is not Home Page", "FAIL");
		}
	}

	public FindLeadPage enterByFromLeadFirstName(String data) {
		enterByName("firstName", data);
		return this;
	}
	public FindLeadPage clickOnFindLeads() throws InterruptedException {
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(1500);
		return this;
	}
	public FindLeadPage clickOnLeadList()
	{
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		return this;
	}
	
	public MergeLeadPage switchToMergeLeadParentWindow(){
		switchToParentWindow();
		return new MergeLeadPage(driver, test);
}

	public FindLeadPage enterByToLeadFirstName(String data) {
		enterByName("firstName", data);
		return this;
	}
	
}
