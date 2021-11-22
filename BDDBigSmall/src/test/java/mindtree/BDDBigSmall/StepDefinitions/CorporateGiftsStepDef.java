package mindtree.BDDBigSmall.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import mindtree.BDDBigSmall.pageObject.CorporateGiftsPOM;
import mindtree.BDDBigSmall.utility.BaseClass;

public class CorporateGiftsStepDef extends BaseClass {
	public static Logger log = LogManager.getLogger(CorporateGiftsStepDef.class.getName());
	CorporateGiftsPOM obj = new CorporateGiftsPOM(driver);

	@Then("^Select Corporate Gifts from Navigation Bar$")
	public void select_corporate_gifts_from_navigation_bar() throws Throwable {
		log.info("Select corporate gifts from navigation bar");
		test.info("Select corporate gifts from navigation bar");
		obj.getCorporategifts().click();
	}

	@And("^User will navigate To corporate gift page$")
	public void user_will_navigate_to_corporate_gift_page() throws Throwable {
		log.info("Form will Open for inquiry after navigation to Corporate Gifts");
		test.info("Form will Open for inquiry after navigation to Corporate Gifts");
	}

	@And("^Enter the Details in the form (.+) and (.+) and (.+) and (.+)$")
	public void enter_the_details_in_the_form_and_and_and(String name, String email, String phone, String inquiry)
			throws Throwable {
		log.info("Fill the form with respective fields");
		log.info("Input Name");
		test.info("Fill the form with respective fields");
		test.info("Input Name");
		obj.getName().sendKeys(name);
		log.info("Input email-id");
		test.info("Input email-id");
		obj.getEmail().sendKeys(email);
		log.info("Input Phone number");
		test.info("Input Phone number");
		obj.getPhoneNo().sendKeys(phone);
		log.info("Input Message for inquiry");
		test.info("Input Message for inquiry");
		obj.getinquiry().sendKeys(inquiry);
	}

	@And("^Hit the inquire now$")
	public void hit_the_inquire_now() throws Throwable {
		log.info("Verify the details and Hit Submit button to put inquiry");
		test.info("Verify the details and Hit Submit button to put inquiry");
		obj.getSubmit().click();
		log.info("Inquiry submitted will reach you soon...!");
		test.info("Inquiry submitted will reach you soon...!");
	}
}
