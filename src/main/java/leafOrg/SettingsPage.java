package leafOrg;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.LeafOrgWrappers;

public class SettingsPage  extends HomePage{ 



	public SettingsPage(AndroidDriver<?> driver, ExtentTest test) {
		super(driver, test);
	}

	public MyProfilePage clickMyProfile(){
		clickByXpath(prop.getProperty("Settings.MyProfile.Xpath"));		
		return new MyProfilePage(driver, test);
	}

	public SettingsPage clickLogout(){
		clickByXpath(prop.getProperty("Settings.Logout.Xpath"));		
		return this;
	}

	public LoginPage clickYesLogout(){
		clickByXpath(prop.getProperty("Settings.YesLogout.Xpath"));		
		return new LoginPage(driver, test);
	}

	public ChangePasswordPage clickChangePassword(){
		clickByXpath(prop.getProperty("Settings.ChangePassword.Xpath"));  
		return new ChangePasswordPage(driver, test);
	}

	public ParticipantDetailsPage clickParticipantDetails(){
		clickByXpath(prop.getProperty("Settings.ParticipantDetails.Xpath"));  
		return new ParticipantDetailsPage(driver, test);
	}

	public BatchesPage clickBatches(){
		clickByXpath(prop.getProperty("Settings.Batches.Xpath"));  
		return new BatchesPage(driver, test);
	}

	public ContactSupportPage clickContactSupport(){
		clickByXpath(prop.getProperty("Settings.ContactSupport.Xpath"));  
		return new ContactSupportPage(driver, test);
	}
}
