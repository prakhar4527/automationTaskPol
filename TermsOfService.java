package automationTask;

import org.openqa.selenium.WebDriver;

import com.qait.automation.TestSessionInitiator;
import com.qait.automation.getpageobjects.GetPage;

public class TermsOfService extends GetPage
{
	WebDriver driver;
	public TermsOfService(WebDriver driver)
	{
		super(driver, "termsOfService");
	}
	protected TestSessionInitiator testSessionInitiator;
	public void Footer_Links_Terms_Of_Service()
	{
		clickUsingJS(element("Terms_Of_Service"));
		verifyPageTitleContains();
		logAssertionPassedMessage("Terms of Service takes the user to Terms of Service page");
	}

}
