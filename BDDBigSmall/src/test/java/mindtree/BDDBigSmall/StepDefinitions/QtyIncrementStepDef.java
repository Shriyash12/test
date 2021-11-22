package mindtree.BDDBigSmall.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import mindtree.BDDBigSmall.pageObject.QuantityIncrementPOM;
import mindtree.BDDBigSmall.utility.BaseClass;

public class QtyIncrementStepDef extends BaseClass {
	public static Logger log = LogManager.getLogger(QtyIncrementStepDef.class.getName());
	QuantityIncrementPOM obj = new QuantityIncrementPOM(driver);

	@Then("^Select Santa gifts in navigation bar$")
	public void select_santa_gifts_in_navigation_bar() throws Throwable {
		log.info("Select Santa gift From navigation bar");
		test.info("Select Santa gift From navigation bar");
		obj.getSantaGifts().click();
	}

	@And("^User will navigate to search page for santa gifts select product$")
	public void user_will_navigate_to_search_page_for_santa_gifts_select_product() throws Throwable {
		log.info("Result for Santa gift will be displayed");
		test.info("Result for Santa gift will be displayed");
		obj.getProduct().click();
		log.info("Select the product");
		test.info("Select the product");
	}

	@And("^Increment the Quantity of the product$")
	public void increment_the_quantity_of_the_product() throws Throwable {
		log.info("Increment the quantity of product");
		test.info("Increment the quantity of product");
		obj.getQty().click();
		log.info("Quantity incremented from one to two");
		test.info("Quantity incremented from one to two");
	}

	@And("^Add this product to cart$")
	public void add_this_product_to_cart() throws Throwable {
		log.info("Add this product to cart");
		test.info("Add this product to cart");
		obj.getAddToCart().click();
		log.info("Product added to cart");
		test.info("Product added to cart");
	}

}
