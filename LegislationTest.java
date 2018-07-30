package automationTask;

import org.testng.annotations.Test;

import com.qait.politico.pro.tests.Base_Pro_FrontEnd_Test;

public class LegislationTest extends Base_Pro_FrontEnd_Test 
{

	@Test
	public void test01_verifyLegislationCompassWithValidCredentails()
	{
		test.legislationAction.login_valid_credentials_verify(getConfigValue("LCFrontEnd_User1.username"),getConfigValue("LCFrontEnd_User1.password"));
		test.billSearch.verifyLegislationSearchBillPage();
	}
	@Test
	public void test02_verify_three_buttons_present_on_bill_detail_page()
	{
		test.legislationAction.verify_three_buttons_present_on_bill_detail_page();
	}
	@Test
	public void test03_verify_To_check_add_to_folder_modal_window()
	{
		test.legislationAction.To_check_add_to_folder_modal_window();
	}
	@Test
	public void test04_verify_track_modal_window()
	{
		test.legislationAction.track_modal_window_pop_up();
	}
	@Test
	public void test05_verify_email_alert_modal_window_is_displayed()
	{
		test.legislationAction.email_alert_settings();
		test.legislationAction.email_settings_for_federal_bill();
		//test.legislationAction.email_settings_for_state_bill();
	}
}
