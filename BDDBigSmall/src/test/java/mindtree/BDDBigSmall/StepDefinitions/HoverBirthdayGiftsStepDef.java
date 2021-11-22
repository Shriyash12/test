package mindtree.BDDBigSmall.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import mindtree.BDDBigSmall.pageObject.HoverBirtdayGiftPOM;
import mindtree.BDDBigSmall.utility.BaseClass;

public class HoverBirthdayGiftsStepDef extends BaseClass {
	public static Logger log = LogManager.getLogger(HoverBirthdayGiftsStepDef.class.getName());
	HoverBirtdayGiftPOM obj = new HoverBirtdayGiftPOM(driver);

	@Then("^Hover on Dynamic dropdown in navigation bar$")
	public void hover_on_dynamic_dropdown_in_navigation_bar() throws Throwable {
		log.info("Hover mouse on Birthday gifts");
		test.info("Hover mouse on Birthday gifts");
		Actions act = new Actions(driver);
		WebElement ele = obj.getBirthdayGifts();
		act.moveToElement(ele).perform();
		log.info("Getting Dropdown for Birthday Gifts for");
		test.info("Getting Dropdown for Birthday Gifts for");
	}

	@And("^Select any option from dropdown$")
	public void select_any_option_from_dropdown() throws Throwable {
		log.info("Select /'Return Birthday gift'/ from Suggested dropdown");
		test.info("Select /'Return Birthday gift'/ from Suggested dropdown");
		obj.getOptionDropdown().click();
	}

	@And("^User will navigate to search results$")
	public void user_will_navigate_to_search_results() throws Throwable {
		log.info("User will get results for /'Return Birthday gifts'/.");
		test.info("User will get results for /'Return Birthday gifts'/.");
	}

	@And("^Select the Product from results and click on it to open$")
	public void select_the_product_from_results_and_click_on_it_to_open() throws Throwable {
		log.info("Select the Gifting product");
		test.info("Select the Gifting product");
		obj.getProduct().click();
		log.info("Select variety of product");
		test.info("Select variety of product");
		obj.getProductVariety().click();
	}

	@And("^Add product to cart$")
	public void add_product_to_cart() throws Throwable {
		log.info("Add selected product to cart");
		test.info("Add selected product to cart");
		obj.getAddToCart().click();
	}
}
