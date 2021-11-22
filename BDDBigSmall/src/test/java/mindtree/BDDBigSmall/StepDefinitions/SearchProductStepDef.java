package mindtree.BDDBigSmall.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import mindtree.BDDBigSmall.pageObject.SearchProductPOM;
import mindtree.BDDBigSmall.utility.BaseClass;
import mindtree.BDDBigSmall.utility.ExcelInitialization;

public class SearchProductStepDef extends BaseClass {
	public static Logger log = LogManager.getLogger(SearchProductStepDef.class.getName());
	SearchProductPOM obj = new SearchProductPOM(driver);
	ExcelInitialization exe = new ExcelInitialization(
			"C:\\Users\\M1073173\\SeleniumStuff\\BDDBigSmall\\src\\test\\resources\\TestingData.xlsx", "testdata");
	String productName1 = "";

	@Then("^Search result page is displayed$")
	public void search_result_page_is_displayed() throws Throwable {
		log.info("Navigated to search result page");
		test.info("Navigated to search result page");
	}

	@And("^Input some keys in Search bar of hit enter$")
	public void input_some_keys_in_search_bar_of_hit_enter() throws Throwable {
		log.info("Search for some product inputting keys from keyboard in search bar");
		log.info("Inputting /'pocket wa'/ and getting keyword from dropdown suggestions");
		test.info("Search for some product inputting keys from keyboard in search bar");
		test.info("Inputting /'pocket wa'/ and getting keyword from dropdown suggestions");
		obj.getSearchBar().sendKeys(exe.getData(4, 1), Keys.ARROW_DOWN, Keys.ENTER);
	}

	@And("^Select the product and get the name of product$")
	public void select_the_product_and_get_the_name_of_product() throws Throwable {
		log.info("Selecting the product from search result page");
		test.info("Selecting the product from search result page");
		productName1 = obj.getProduct().getText();
		obj.getProduct().click();
	}

	@And("^Product details page is displayed$")
	public void product_details_page_is_displayed() throws Throwable {
		log.info("Product Results are displayed according to inputed keys");
		test.info("Product Results are displayed according to inputed keys");
	}

	@And("^Validate the name of product with name of product on search result page$")
	public void validate_the_name_of_product_with_name_of_product_on_search_result_page() throws Throwable {

		log.info("Product Selected and Navigated to Product details page");
		test.info("Product Selected and Navigated to Product details page");
		String productName2 = obj.getTitle().getText();

		try {
			Assert.assertEquals(productName2, productName1);
			log.info("Product name matched");
			test.info("Product name matched");

		} catch (AssertionError e) {
			log.error("Product name not matched");
			test.fail("Product name not matched");
		}

	}
}
