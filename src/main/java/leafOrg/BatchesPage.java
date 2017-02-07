package leafOrg;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.LeafOrgWrappers;

public class BatchesPage extends LeafOrgWrappers{ 

	public BatchesPage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}

	public BatchesPage clickAdd(){
		clickXpathUsingActions(prop.getProperty("BatchesPage.Add.Xpath"));		
		return this;
	}


	public BatchesPage enterCompany(String company){
		enterTextByXpathUsingActions(prop.getProperty("BatchesPage.EnterCompany.Xpath"), company);
		return this;
	}

	public BatchesPage clickCompany(String company){
		clickXpathUsingActions(prop.getProperty("//ion-label[text()[contains(.,'"+company+"')]]"));
		return this;
	}

	public SettingsPage verifyBatchesStatus(String data){
		verifyTextByXpath(prop.getProperty("AlertMsg.Xpath"), data);
		clickByXpath(prop.getProperty("AlertOk.Xpath"));		
		return new SettingsPage(driver, test);
	}



}
