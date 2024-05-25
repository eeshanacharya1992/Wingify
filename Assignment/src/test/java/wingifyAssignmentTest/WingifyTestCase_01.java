package wingifyAssignmentTest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wingifyAssignmentSource.LoginPage;

public class WingifyTestCase_01 extends LaunchAndQuit {
	
	@Test
    public void launchingandlogin() throws InterruptedException
    {
    	
    	LoginPage l1= new  LoginPage(driver);
    	l1.bluecircleclick();
    	l1.back(driver);
    	l1.twitterclick();
    	l1.facebookclick();
    	l1.linkedinclick();
     	l1.usernametextfield();
    	 l1.passwordtextfield();
    	 l1.remembermebutton();
    	l1.loginbuttonclick(); 
    }
}
