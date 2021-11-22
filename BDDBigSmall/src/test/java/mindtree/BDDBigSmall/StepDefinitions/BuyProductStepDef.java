package mindtree.BDDBigSmall.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import mindtree.BDDBigSmall.pageObject.BuyProductPOM;
import mindtree.BDDBigSmall.utility.BaseClass;
import mindtree.BDDBigSmall.utility.ExcelInitialization;

public class BuyProductStepDef extends BaseClass {
	public static Logger log = LogManager.getLogger(SignInStepDef.class.getName());

	ExcelInitialization exe = new ExcelInitialization(
			"C:\\Users\\M1073173\\SeleniumStuff\\BDDBigSmall\\src\\test\\resources\\TestingData.xlsx", "testdata");

	BuyProductPOM obj = new BuyProductPOM(driver);

	@And("^Search for product by entering keys in Search bar$")
	public void search_for_product_by_entering_keys_in_Search_bar() throws Throwable {
		log.info("Select the product from search results to buy");
		test.info("Select the product from search results to buy");
		obj.getclickSearchBar().sendKeys(exe.getData(5, 1), Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Search result page is displayed for search keys$")
	public void search_result_page_is_displayed_for_search_keys() throws Throwable {
		log.info("Search product by entering product related name in search bar");
		test.info("Search product by entering product related name in search bar");

	}

	@And("^Select the product$")
	public void select_the_product() throws Throwable {
		log.info("Open the selected product");
		test.info("Open the selected product");
		obj.getFirstProduct().click();

	}

	@And("^Add product to cart to buy$")
	public void add_product_to_cart_to_buy() throws Throwable {
		log.info("Add the product to cart");
		test.info("Add the product to cart");
		obj.getCart().click();
		log.info("Go to checkout after adding to cart");
		test.info("Go to checkout after adding to cart");
		obj.getCheckout().click();
		log.info("Cut the popup of Whatsapp");
		test.info("Cut the popup of Whatsapp");
		obj.getWhatsapp().click();

	}

	@And("^Fill the Delivery details (\\d+) and (\\d+) continue$")
	public void fill_the_Delivery_details_and_continue(String pin, String phone) throws Throwable {
		log.info("Fill the delivery details with respective fields");
		test.info("Fill the delivery details with respective fields");
		obj.getEmail().sendKeys(exe.getData(10, 1));
		obj.getFirstNmae().sendKeys(exe.getData(11, 1));
		obj.getLastNmae().sendKeys(exe.getData(12, 1));
		obj.getAddress().sendKeys(exe.getData(13, 1));
		obj.getLandmark().sendKeys(exe.getData(14, 1));
		obj.getCity().sendKeys(exe.getData(15, 1));
		Select sel = new Select(obj.getState());
		sel.selectByIndex(22);
		obj.getPinCode().sendKeys(pin);
		obj.getPhoneNo().sendKeys(phone);
		log.info("Delivery details filled");
		test.info("Delivery details filled");

	}

	@And("^Continue shopping order placed$")
	public void continue_shopping_order_placed() throws Throwable {
		log.info("Click on continue shipping");
		test.info("Click on continue shipping");
		obj.getContinueShipping().sendKeys(Keys.ENTER);
		log.info("buying process completed");
		test.info("buying process completed");

	}
}
