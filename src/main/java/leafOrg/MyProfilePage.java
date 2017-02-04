package leafOrg;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.LeafOrgWrappers;

public class MyProfilePage extends HomePage{ 



	public MyProfilePage(AndroidDriver<?> driver, ExtentTest test) {
		super(driver, test);
	}

	public MyProfilePage clickSaveChanges(){
		clickByXpath(prop.getProperty("MyProfilePage.SaveChanges.Xpath"));		
		return this;
	}
	
	public MyProfilePage changeFirstName(String fName){
		enterTextByXpath(prop.getProperty("MyProfilePage.fName.Xpath"),fName);
		return this;
	}

	
	public MyProfilePage changeLastName(String lName){
		enterTextByXpath(prop.getProperty("MyProfilePage.lName.Xpath"),lName);
		return this;
	}

	
	public MyProfilePage changePhoneNumber(String phone){
		enterTextByXpath(prop.getProperty("MyProfilePage.phone.Xpath"),phone);
		return this;
	}
	
	public MyProfilePage verifyMessageAndClickOk(String message){
		verifyTextByXpath(prop.getProperty("AlertMsg.Xpath"),message);	
		clickByXpath(prop.getProperty("AlertOk.Xpath"));		
		return this;
	}
	
	

	
}
