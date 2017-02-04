package leafOrg;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.LeafOrgWrappers;

public class ParticipantDetailsPage extends LeafOrgWrappers{ 

	public ParticipantDetailsPage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}

	public ParticipantDetailsPage enterMentorName(String mentorName){
		enterTextByXpathUsingActions(prop.getProperty("ParticipantDetails.mentorName.Xpath"),mentorName);		
		return this;
	}

	public ParticipantDetailsPage enterDriversLicense(String driversLicense){
		enterTextByXpathUsingActions(prop.getProperty("ParticipantDetails.DriversLicense.Xpath"),driversLicense);		
		return this;
	}

	public ParticipantDetailsPage clickSaveChanges(){
		clickByXpath(prop.getProperty("SaveChanges.Xpath"));		
		return this;
	}

	public ParticipantDetailsPage verifyChangesSaved(String data){
		verifyTextByXpath(prop.getProperty("AlertMsg.Xpath"), data);
		clickByXpath(prop.getProperty("AlertOk.Xpath"));		
		return this;
	}

	public HomePage clickMyInfo(){
		clickByXpath(prop.getProperty("HomePage.MyInfo.Xpath"));		
		return new HomePage(driver, test);
	}
}
