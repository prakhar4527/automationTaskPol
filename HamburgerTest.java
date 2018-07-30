package automationTask;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;
import com.qait.automation.getpageobjects.BaseUi;
import com.qait.politico.core.tests.Base_Core_Test;

public class HamburgerTest extends Base_Core_Test
{					
	@Test
	public void Test_01_VerifyClickOnPoliticoLogo()
	{
		test.hamburgerMenu.verifyHamburgerIcon();
		test.hamburgerMenu.Header_Is_Displayed_On_Home_Page();
		test.hamburgerMenu.Click_On_Politico_Logo();
	}
	@Test
	public void Test_02_LoginLinkPresentInHamburgerMenu()
	{
		test.hamburgerMenu.Login_In_Hamburger_Menu();
	}
	@Test
	public void Test_03_VerifyAdsShownInEachArticle()
	{
		test.adsInAgenda.verify_ads_in_agenda();
	}
	@Test
	public void Test_04_VerifyContentsOfArticlePage()
	{
		test.contentInAgenda.ClickOnAnyArticle();
		test.contentInAgenda.checkPageContainsImage();
		test.contentInAgenda.checkTitleOfArticlePage();
		test.contentInAgenda.verifyReadIndicatorAtTheTopOfArticlePage();
		test.contentInAgenda.verifyUpNextIndicatorOnArticlePage();
	}
	@Test
	public void Test_05_verifyFooterLinks() 
	{
		test.termsOfService.Footer_Links_Terms_Of_Service();
		test.privacyPolicy.Footer_Links_Privacy_Policy();
	}
}