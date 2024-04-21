//TC-2-Validate the login functionality with valid credentials

package Project2.GoIbibo;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon.ProjectOne.Amz_B2C_HomePage_1;
import Amazon.ProjectOne.Amz_B2C_Registration_Page_2;
import Utility.Data_Fetching_GoIbibo;
import Utility.Listeners_Class;
//import TestNg06032024.Listeners_Class;
import Utility.Listeners_Class3;

@Listeners(Listeners_Class.class)

public class Testcase_02 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_Logic.class,groups= {"Smoke","System"},invocationCount=2)
	public void CheckLoginFunc_Testcase_2() throws InterruptedException, EncryptedDocumentException, IOException {
		Data_Fetching_GoIbibo d1= new Data_Fetching_GoIbibo();
		d1.fetch();
		
		GoIbibo_B2C_HomePage_1 a1 = new GoIbibo_B2C_HomePage_1(driver);
		Reporter.log("Routing to the Homepage is Done");
		a1.passMobNumTf();
		Reporter.log("Routing to the Registration Pop up is Done");

		
		GoIbibo_B2C_RegistrationPage_Pop_up_2 a2 = new GoIbibo_B2C_RegistrationPage_Pop_up_2(driver);
		//a2.clickOnletsGoBtn();
		a2.clickOnIllDoitLaterBtn();
		Reporter.log("Routing to the Complete Registration is Done");

		GoIbibo_B2C_HomePage_After_Login_3 a3 = new GoIbibo_B2C_HomePage_After_Login_3(driver);
		a3.checkOneWay();

	}

}
