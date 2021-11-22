package mindtree.BDDBigSmall.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import mindtree.BDDBigSmall.pageObject.GiftCardPOM;
import mindtree.BDDBigSmall.utility.BaseClass;

public class GiftCardStepDef extends BaseClass {
	public static Logger log = LogManager.getLogger(GiftCardStepDef.class.getName());
	GiftCardPOM obj = new GiftCardPOM(driver);

	@Then("^Select Gift card from Header Section$")
	public void select_gift_card_from_header_section() throws Throwable {
		log.info("Select the gift from navigation bar.");
		test.info("Select the gift from navigation bar.");
		obj.getGiftCard().click();
	}

	@And("^User will navigate Gift Card Buying page$")
	public void user_will_navigate_gift_card_buying_page() throws Throwable {
		log.info("Popup will open for the gift card");
		test.info("Popup will open for the gift card");
	}

	@Then("^Select the amount of Gift card$")
	public void select_the_amount_of_Gift_card() throws Throwable {
		log.info("Select the amount for gift card");
		test.info("Select the amount for gift card");
		obj.getAmount().click();
	}

	@And("^Add Gift card to cart$")
	public void add_gift_card_to_cart() throws Throwable {
		log.info("Adding gift card to cart");
		test.info("Adding gift card to cart");
		obj.getCart().click();
	}
}
