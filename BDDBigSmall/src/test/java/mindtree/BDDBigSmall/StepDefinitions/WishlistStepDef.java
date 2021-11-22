package mindtree.BDDBigSmall.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import mindtree.BDDBigSmall.pageObject.addToWishlistPOM;
import mindtree.BDDBigSmall.utility.BaseClass;

public class WishlistStepDef extends BaseClass {
	public static Logger log = LogManager.getLogger(WishlistStepDef.class.getName());
	addToWishlistPOM obj = new addToWishlistPOM(driver);

	@Then("^Select Top50 gifts in navigation bar$")
	public void select_top50_gifts_in_navigation_bar() throws Throwable {
		log.info("Click on Top50 from navigation bar");
		test.info("Click on Top50 from navigation bar");
		obj.getTop50().click();
	}

	@And("^User will navigate to search page select product$")
	public void user_will_navigate_to_search_page_select_product() throws Throwable {
		log.info("Choose the product from the result");
		test.info("Choose the product from the result");
		obj.getProduct().click();
	}

	@And("^Add product to wishlist$")
	public void add_product_to_wishlist() throws Throwable {
		log.info("Add product to wishlist");
		test.info("Add product to wishlist");
		obj.getAddtoWishlist().click();
		log.info("Product wishlisted");
		test.info("Product wishlisted");
	}

	@And("^Click on wishlist icon in header section$")
	public void click_on_wishlist_icon_in_header_section() throws Throwable {
		log.info("Click on wishlist icon from header section");
		test.info("Click on wishlist icon from header section");
		obj.getWishlist().click();
		log.info("Continue wishlist");
		test.info("Continue wishlist");
		obj.getContinueWishlist().click();
	}

	@And("^Add product to cart from wishlist$")
	public void add_product_to_cart_from_wishlist() throws Throwable {
		log.info("Move wishlisted product to cart");
		test.info("Move wishlisted product to cart");
		obj.getAddToCart().click();
		log.info("Product wishlisted and moved to cart");
		test.info("Product wishlisted and moved to cart");
	}
}
