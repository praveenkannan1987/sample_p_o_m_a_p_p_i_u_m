package leafOrg;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.LeafOrgWrappers;

public class ChangePasswordPage extends LeafOrgWrappers{


	public ChangePasswordPage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}

	public ChangePasswordPage enterCurrentPassword(String currentPassword){
		enterTextByXpathUsingActions(prop.getProperty("ChangePassword.CurrentPassword.Xpath"), currentPassword);
		return this;
	}

	public ChangePasswordPage enterNewPassword(String newPassword){
		enterTextByXpathUsingActions(prop.getProperty("ChangePassword.NewPassword.Xpath"), newPassword);
		return this;
	}

	public ChangePasswordPage enterNewPasswordAgain(String newPasswordAgain){
		enterTextByXpathUsingActions(prop.getProperty("ChangePassword.NewPasswordAgain.Xpath"), newPasswordAgain);
		return this;
	}

	public ChangePasswordPage clickChangePassword(){
		clickByXpath(prop.getProperty("ChangePassword.ChangePassword.Xpath"));		
		return this;
	}

	public SettingsPage verifyPasswordUpdate(String data){
		verifyTextByXpath(prop.getProperty("AlertMsg.Xpath"), data);
		clickByXpath(prop.getProperty("AlertOk.Xpath"));		
		return new SettingsPage(driver, test);
	}

}
