package wingifyAssignmentSource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage {
  ChromeDriver driver;
  @FindBy(xpath="//a[@href='index.html']")
  WebElement bluecircle;
  @FindBy(xpath="(//a[@href='#'])[1]")
  WebElement twitter;
  @FindBy(xpath="(//a[@href='#'])[2]")
  WebElement facebook;
  @FindBy(xpath="(//a[@href='#'])[3]")
  WebElement linkedin;
  @FindBy(id="username")
  WebElement username;
  @FindBy(id="password")
  WebElement password;
  @FindBy(xpath="//input[@type='checkbox']")
  WebElement rememberme;
  @FindBy(id="log-in")
  WebElement loginbutton;
  public void bluecircleclick() throws InterruptedException
  {
	if(bluecircle.isDisplayed()==true)
	{
		
		Assert.assertEquals(bluecircle.isDisplayed(), true);
		bluecircle.click();
		Thread.sleep(4000);
	}
	
  }
  public void back(ChromeDriver driver)
  { 
	  driver.navigate().back();
  }
  public void twitterclick() throws InterruptedException
  {   Thread.sleep(4000);
	  twitter.click();
  }
  public void facebookclick() throws InterruptedException
  {   Thread.sleep(4000);
	  facebook.click();
  }
  public void linkedinclick() throws InterruptedException
  {   Thread.sleep(4000);
	  linkedin.click();
  }
  public void usernametextfield() throws InterruptedException
  {   Thread.sleep(4000);
	  username.sendKeys("eeshan");
  }
  
  public void passwordtextfield() throws InterruptedException
  {   Thread.sleep(4000);
	  password.sendKeys("123456");
  }
  public void remembermebutton() throws InterruptedException
  {   Thread.sleep(4000);
	  rememberme.click();
  }
  public void loginbuttonclick() throws InterruptedException
  {    Thread.sleep(4000);
	  loginbutton.click();
  }
  public LoginPage(ChromeDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
}
