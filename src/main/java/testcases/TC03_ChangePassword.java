package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import leafOrg.LoginPage;
import wrapper.LeafOrgWrappers;

public class TC03_ChangePassword extends LeafOrgWrappers{

	@BeforeClass
	public void setValues(){
		dataSheetName 	= "TC003";
		testCaseName 	= "Change Password in LeafOrg App";
		testDescription = "Change Password in LeafOrg app (using POM framework)";
		categories = "smoke";
		authors = "Testleaf";

	}

	@Test(dataProvider="fetchData")
	public void login(String deviceName,String version, String email,String Password, String currentPassword, String newPassword, String newPasswordAgain, String data) throws IOException {
		new LoginPage(driver, test)
		.loginToLeafOrg(deviceName, version, email, Password)
		.clickSettings()
		.clickChangePassword()
		.enterCurrentPassword(currentPassword)
		.enterNewPassword(newPassword)
		.enterNewPasswordAgain(newPasswordAgain)
		.clickChangePassword()
		.verifyPasswordUpdate(data)
		.clickLogout()
		.clickYesLogout()
		.loginToLeafOrg(email, newPassword)
		.clickSettings()
		.clickLogout()
		.clickYesLogout();
	}


}
