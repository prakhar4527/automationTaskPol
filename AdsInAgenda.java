package automationTask;

import org.openqa.selenium.WebDriver;
import com.qait.automation.TestSessionInitiator;
import com.qait.automation.getpageobjects.GetPage;

public class AdsInAgenda extends GetPage
{
	WebDriver driver;
	protected TestSessionInitiator testSessionInitiator;
	public AdsInAgenda(WebDriver driver)
	{
		super(driver, "login_link");
	}
	/*
	 *Verify the ads.
	 * */
	public void verify_ads_in_agenda() 
	{
		clickUsingJS(element("The_Agenda_Link"));
		changeWindow(1);
		wait.waitForPageToLoadCompletely();
		isElementDisplayed("ads_between_articles");
		//clickUsingJS(element("ads_between_articles"));
		 scrollDown(element("ad_after_scroll"));
		 isElementDisplayed("ad_after_scroll");
	}

}
