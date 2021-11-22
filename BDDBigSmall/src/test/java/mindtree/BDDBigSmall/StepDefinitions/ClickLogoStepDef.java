package mindtree.BDDBigSmall.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import mindtree.BDDBigSmall.pageObject.ClickLogoPOM;
import mindtree.BDDBigSmall.utility.BaseClass;

public class ClickLogoStepDef extends BaseClass {
	public static Logger log = LogManager.getLogger(ClickLogoStepDef.class.getName());
	ClickLogoPOM obj = new ClickLogoPOM(driver);

	@Then("^Click All of it from Header Section$")
	public void click_all_of_it_from_header_section() throws Throwable {
		log.info("Click on /'All of it'/ from the navigation bar");
		test.info("Click on /'All of it'/ from the navigation bar");
		obj.getAllofIt().click();
	}

	@And("^Select the product from All of it Results$")
	public void select_the_product_from_all_of_it_results() throws Throwable {
		log.info("Select the Product from Search results");
		test.info("Select the Product from Search results");
		obj.getFirstProduct().click();
	}

	@And("^Click on the logo on top navigate back to Landing Page$")
	public void click_on_the_logo_on_top_navigate_back_to_landing_page() throws Throwable {
		log.info("Checking the functionality of logo, After clicking logo navigate to Home page");
		test.info("Checking the functionality of logo, After clicking logo navigate to Home page");
		log.info("Validating weather logo is visible or not");
		test.info("Validating weather logo is visible or not");
		if (obj.getHomePage().isDisplayed() == true) {
			log.info("Logo is Available on current page");
			test.info("Logo is Available on current page");
		} else {
			log.info("Logo is Not-Available on current page");
			test.info("Logo is Not-Available on current page");
		}
		log.info("Click on Logo");
		test.info("Click on Logo");
		obj.getHomePage().click();
		log.info("User navigated back to Homepage from Product Details page");
		test.info("User navigated back to Homepage from Product Details page");
	}
}
