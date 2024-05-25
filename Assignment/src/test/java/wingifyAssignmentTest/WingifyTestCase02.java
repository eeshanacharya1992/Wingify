package wingifyAssignmentTest;

import org.testng.annotations.Test;

import wingifyAssignmentSource.HomePage;
import wingifyAssignmentSource.LoginPage;

public class WingifyTestCase02 extends LaunchAndQuit {
	@Test
    public void launchinghomepageafterlogin() throws InterruptedException
    {
    	
    	LoginPage l1= new  LoginPage(driver);
         	l1.usernametextfield();
    	 l1.passwordtextfield();
    	 l1.remembermebutton();
    	l1.loginbuttonclick(); 
     HomePage h1= new HomePage(driver);
     System.out.println("Display the entire table");
     System.out.println("------------------------");
     h1.fulltable();
    System.out.println("Display entire table where amount sorted in increasing order");
    System.out.println("------------------------");
     h1.amountsortinincreasingorder();
     h1.fulltable();
     System.out.println("Display entire table where amount sorted in decreasing order");
     System.out.println("------------------------");
     h1.amountsortindecreasingorder();
     h1.fulltable();
   
    }
}
