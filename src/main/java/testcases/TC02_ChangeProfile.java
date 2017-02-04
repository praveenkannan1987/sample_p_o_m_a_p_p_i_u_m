package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import leafOrg.LoginPage;
import wrapper.LeafOrgWrappers;

public class TC02_ChangeProfile extends LeafOrgWrappers{

	@BeforeClass
	public void setValues(){
		dataSheetName 	= "TC002";
		testCaseName 	= "Login to LeafOrg App";
		testDescription = "Login to LeafOrg app (using POM framework)";
		categories = "smoke";
		authors = "Testleaf";

	}

	@Test(dataProvider="fetchData")
	public void login(String deviceName,String version, String email,String Password,
					  String fName, String lName, String phone, String message) throws IOException {
		new LoginPage(driver, test).

		loginToLeafOrg(deviceName, version, email, Password)
		.clickSettings()
		.clickMyProfile()
		.changeFirstName(fName)
		.changeLastName(lName)
		.changePhoneNumber(phone)
		.clickSaveChanges()
		.verifyMessageAndClickOk(message)
		.clickSettings()
		.clickLogout()
		.clickYesLogout();

	}


}
