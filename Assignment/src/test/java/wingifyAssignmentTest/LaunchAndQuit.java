package wingifyAssignmentTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit {
	ChromeDriver driver;
	@BeforeMethod()
   public void launching()
   {
		 driver= new ChromeDriver();
	    	driver.get("https://sakshingp.github.io/assignment/login.html");
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   @AfterMethod()
   public void quiting() throws IOException
   {   TakesScreenshot ts= driver;
      File source= ts.getScreenshotAs(OutputType.FILE);
      File destination=new File("C:\\Users\\dell\\eclipse-workspace\\Assignment\\Screenshot\\EeshanWingify"+Math.random()+".png");
      FileHandler.copy(source, destination);
	   driver.quit();
   }
}
