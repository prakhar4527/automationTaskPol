package automationTask;

import org.openqa.selenium.WebDriver;

import com.qait.automation.TestSessionInitiator;
import com.qait.automation.getpageobjects.GetPage;

public class PrivacyPolicy extends GetPage
{
	WebDriver driver;
	protected TestSessionInitiator testSessionInitiator;
	public PrivacyPolicy(WebDriver driver)
	{
		super(driver, "privacyPolicy");
	}
	public void Footer_Links_Privacy_Policy() 
	{
		clickUsingJS(element("Privacy_Policy"));
		verifyPageTitleContains();
		logAssertionPassedMessage("Privacy Policy takes the user to Privacy Policy page");
		
	}
	

}
