package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Create Lead | opentaps CRM")) {
			reportStep("This is not Home Page", "FAIL");
		}
	}

	public CreateLeadPage enterByCompanyName(String data) {
		enterById("createLeadForm_companyName", data);
		return this;
	}

	public CreateLeadPage enterByFirstName(String data) {
		enterById("createLeadForm_firstName", data);
		return this;
	}

	public CreateLeadPage enterByLastName(String data) {
		enterById("createLeadForm_lastName", data);
		return this;
	}

	public CreateLeadPage enterByEmail(String data) {
		enterById("createLeadForm_primaryEmail", data);
		return this;
	}

	public CreateLeadPage enterBymobilenumber(String data) {
		enterById("createLeadForm_primaryPhoneNumber", data);
		return this;
	}

	public ViewLeadPage clickByCreateLead()
	{
		clickByXpath("//input[@name='submitButton']");
		return new ViewLeadPage(driver, test);
	}
}
