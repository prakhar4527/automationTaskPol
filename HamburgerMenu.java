package automationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.Assert;

import com.qait.automation.TestSessionInitiator;
import com.qait.automation.getpageobjects.GetPage;
public class HamburgerMenu  extends GetPage
{
	//WebDriver diver;
	protected TestSessionInitiator testSessionInitiator;
	WebDriver driver;
	public HamburgerMenu(WebDriver driver) {
		super(driver,"login_link");
	}
	
	/*
	 * On clicking to Politico Logo on Header it should redirect the user on same page
	 * */
	public void verifyHamburgerIcon() {
		isElementDisplayed("hamburger_icon");
		logAssertionPassedMessage("Header hamburger icon is clickable");
	}
	public void Header_Is_Displayed_On_Home_Page()
	{
		isElementDisplayed("CoreHeader");
		logAssertionPassedMessage("Header is displayed on home page");
	}
	public void Click_On_Politico_Logo()
	{
		clickUsingJS(element("CoreHeader_PoliticoLogo"));
		verifyPageTitleContains();
		Assert.assertTrue(getCurrentURL().contains("ops.politico.com"));
		logAssertionPassedMessage("Navigated to the correct page");
		logAssertionPassedMessage("On clicking to Politico Logo on Header it redirects the user on same\n" + 
				"page");
	}
	/*Verify "Log In" link is present in the hamburger menu.*/
	public void Login_In_Hamburger_Menu()
	{
		clickUsingJS(element("btn_Hamburger"));
		isElementDisplayed("link_HamburgerMenu_Login");
		logAssertionPassedMessage("Hamburger menu expand.\n" + 
				"Link ''Log in\" is present in the Follow Us Section.");
	}
}