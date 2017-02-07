package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import leafOrg.LoginPage;
import wrapper.LeafOrgWrappers;

public class TC05_AddBatches extends LeafOrgWrappers{

	@BeforeClass
	public void setValues(){
		dataSheetName 	= "TC005";
		testCaseName 	= "Change Participant Details in LeafOrg App";
		testDescription = "Change Participant Details in LeafOrg app (using POM framework)";
		categories = "smoke";
		authors = "Testleaf";

	}

	@Test(dataProvider="fetchData")
	public void login(String deviceName,String version, String email,String Password, String company) throws IOException {
		new LoginPage(driver, test).

		loginToLeafOrg(deviceName, version, email, Password)
		.clickSettings()
		.clickBatches()
		.clickAdd()
		.enterCompany(company)
		.clickCompany(company)
		.verifyBatchesStatus("PENDING")
		.clickSettings()		
		.clickLogout()
		.clickYesLogout();

	}


}
