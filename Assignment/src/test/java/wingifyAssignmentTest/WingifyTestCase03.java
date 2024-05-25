package wingifyAssignmentTest;

import org.testng.annotations.Test;

import wingifyAssignmentSource.HomePage;
import wingifyAssignmentSource.LoginPage;

public class WingifyTestCase03 extends LaunchAndQuit {
	@Test
    public void amountsortinincreasingorderfails() throws InterruptedException
    {
    	
    	LoginPage l1= new  LoginPage(driver);
         	l1.usernametextfield();
    	 l1.passwordtextfield();
    	 l1.remembermebutton();
    	l1.loginbuttonclick(); 
    	 HomePage h2= new HomePage(driver);
    	 h2.amountsortinincreasingorderfailure();
}
}