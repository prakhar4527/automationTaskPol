package automationTask;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qait.automation.TestSessionInitiator;
import com.qait.automation.getpageobjects.GetPage;

public class ContentInAgenda extends GetPage
{
	WebDriver driver;
	static String s;
	protected TestSessionInitiator testSessionInitiator;
	public ContentInAgenda(WebDriver driver)
	{
		super(driver, "Agenda");	
	}
	public void ClickOnAnyArticle()
	{
		System.out.println("HELLo");
		clickUsingJS(element("The_Agenda_Link"));
		changeWindow(1);
		wait.waitForPageToLoadCompletely();
		s=element("Random_Article").getAttribute("title");
		clickUsingJS(element("Random_Article"));
	}
	public void checkPageContainsImage()
	{
		isElementDisplayed("Image_Of_Article");
		logAssertionPassedMessage("Image of the article is present");
	}
	public void checkTitleOfArticlePage()
	{
		System.out.println("page Title   "+getPageTitle());
		System.out.println(s);
		Assert.assertTrue(getPageTitle().contains(s));
	}
	public void verifyReadIndicatorAtTheTopOfArticlePage() {
		executeJavascript("window.scrollBy(0,400);");
		Assert.assertTrue(isElementDisplayed("text_NavigationBar_ReadingNow"));
		Assert.assertTrue(isElementDisplayed("div_NavigationBar_ReadingNow"));
		logAssertionPassedMessage("READ Indicator is displayed on the Article Page");
	}
	public void verifyUpNextIndicatorOnArticlePage() {
		Assert.assertTrue(isElementDisplayed("text_NavBar_UpNext"));
		Assert.assertTrue(isElementDisplayed("div_NavBar_UpNext"));
		logAssertionPassedMessage("UP NEXT indicator is displayed on the Article Page");
	}
}

