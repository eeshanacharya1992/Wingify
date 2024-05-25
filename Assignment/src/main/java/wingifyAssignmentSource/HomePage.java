package wingifyAssignmentSource;

import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
  ChromeDriver driver;
	@FindBy(xpath="//thead")
	WebElement headingofTable;
  @FindBy(xpath="//tbody")
	WebElement contentsofentiretable;

  @FindBy( id="amount")
   WebElement amount;
   public void fulltable()
   {   String a0=headingofTable.getText();  
       System.out.println(a0+"  ");
	   String a= contentsofentiretable.getText();
         System.out.println(a+"  ");
 
 
	   }
   public void amountsortinincreasingorder() throws InterruptedException
   {
	   if(amount.isDisplayed()==true)
		Assert.assertEquals(amount.isDisplayed()==true, true);
	   amount.click();
	   Thread.sleep(4000);
   }
   public void amountsortinincreasingorderfailure() throws InterruptedException
   {
	   if(amount.isDisplayed()==true)
		Assert.assertEquals(amount.isDisplayed()==true, false, "Amounts should sort in increasingorder ");
	   amount.click();
	   Thread.sleep(4000);
   }
   public void amountsortindecreasingorder() throws InterruptedException
   {
	   if(amount.isDisplayed()==true)
		Assert.assertEquals(amount.isDisplayed()==true, true);
	   amount.click();
	   Thread.sleep(4000);
   }
   public void amountsortindecreasingorderfailure() throws InterruptedException
   {
	   if(amount.isDisplayed()==true)
		Assert.assertEquals(amount.isDisplayed()==true, false, "Amounts should sort in decreasing order");
	   amount.click();
	   Thread.sleep(4000);
   }
   public HomePage(ChromeDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
