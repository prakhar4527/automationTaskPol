package automationTask;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class LegislationAction extends GetPage
{

	public LegislationAction(WebDriver driver) 
	{
		super(driver, "legis");
	}
	static int numberOfActions;
	static String[] nameOfActions;
	public void login_valid_credentials_verify(String email , String password)
	{
		verifyPageTitleContains();
		wait.waitForElementToBeVisible(element("email"));
		element("email").sendKeys(email);
		wait.waitForElementToBeVisible(element("password"));
		element("password").sendKeys(password);
		element("submit_button").click();
	}
	
	public void track_modal_window_pop_up()
	{
		//login_valid_credentials(email ,password);
		clickUsingJS(element("track_button"));
		isElementDisplayed("track_with_email_button");
		isElementDisplayed("track_without_alerts");
	}
	public void email_alert_settings()
	{
		clickUsingJS(element("track_with_email_button"));
		isElementDisplayed("email_alert_window");
		logAssertionPassedMessage("email alert modal window is displayed ");
		
		/*
		 * to count number of action on federal bill alert
		 * */
		numberOfActions=elements("email_actions").size();
		//System.out.println("number of action on federal bill"+numberOfActions);
		nameOfActions=new String[numberOfActions];
		for(int i=0;i<numberOfActions;i++)
		{
			nameOfActions[i]=elements("email_actions").get(i).getText();
			//System.out.println(nameOfActions[i]);
		}
		/*int number_Of_Actions=nameOfActions.length;
		System.out.println("number of action on federal bill  "+numberOfActions);*/
		clickUsingJS(element("radio_button"));
		clickUsingJS(element("save_email_alert_button"));
		isElementDisplayed("Naming_Convention_modal_window");
		String s=element("email_bill_no").getText().trim();
		logAssertionPassedMessage("Naming Convention modal window: " + s);
	}
	
	/*Verify the three buttons 'Track Update', 'Add to Folder' and 'Create a Note'
on the bill detail page.*/
	public void verify_three_buttons_present_on_bill_detail_page()
	{
		isElementDisplayed("track_update_button");
		isElementDisplayed("add_to_folder_button");
		isElementDisplayed("create_a_note_button");
		logAssertionPassedMessage("All three buttons are present");
	}
	
	/*Verify the number of actions present in the 'Email Alert Settings' modal
window for the federal and state bill.*/
	public void email_settings_for_federal_bill()
	{
		for(int i=0;i<numberOfActions;i++)
		{
			System.out.println(nameOfActions[i]);
		}
	}
	/*public void email_settings_for_state_bill()
	{
		String url="https://subscriber-stage.politicopro.com/legislative-compass/legislation-search";
		launchSpecificUrl(url);
		clickUsingJS(element("state_bill_button"));
		clickUsingJS(element("random_state_bill"));
		//switchToNextTab();
		//changeWindow(1);
		clickUsingJS(element("track_button"));
		clickUsingJS(element("track_with_email_button"));
		numberOfActions=elements("email_actions").size();
		String[] nameOfActionsOfStateBill=new String[numberOfActions];
		for(int i=0;i<numberOfActions;i++)
		{
			nameOfActions[i]=elements("email_actions").get(i).getText();
			System.out.println(nameOfActions[i]);
		}
	}*/

/*Verify that 'Add to Folder' modal window open up on clicking 'Add to Folder'
button on bill detail page.*/
	
	public void To_check_add_to_folder_modal_window()
	{
		clickUsingJS(element("add_to_folder_button"));
		isElementDisplayed("add_to_folder_modal_window");
		logAssertionPassedMessage("Add to Folder' modal window open up on clicking 'Add to Folder'\n" + 
				"button on bill detail page");
		clickUsingJS(element("add_to_folder_modal_window_close_button"));
	}
	
	
}
