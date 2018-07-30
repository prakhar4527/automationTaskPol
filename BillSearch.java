package automationTask;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class BillSearch extends GetPage
{
	public BillSearch(WebDriver driver) 
	{
		super(driver, "BillSearch");
	}
	public void verifyLegislationSearchBillPage()
	{
		clickUsingJS(element("hamburger_icon"));
		//Click on Legislative Compass under Hamburger menu.
		element("Legis_Comp_link").click();
		changeWindow(1);
		String expectedPagetitleBill="Bill Search - POLITICO Pro";
		verifyPageTitleContains(expectedPagetitleBill);
		clickUsingJS(element("Random_bill"));
		changeWindow(2);
	}
}
