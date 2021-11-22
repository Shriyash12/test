package mindtree.BDDBigSmall.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import mindtree.BDDBigSmall.pageObject.CheckingCodPOM;
import mindtree.BDDBigSmall.utility.BaseClass;
import mindtree.BDDBigSmall.utility.ExcelInitialization;

public class ACODAvailabilityStepDef extends BaseClass {
	public static Logger log = LogManager.getLogger(ACODAvailabilityStepDef.class.getName());
	CheckingCodPOM obj = new CheckingCodPOM(driver);
	ExcelInitialization exe = new ExcelInitialization(
			"C:\\Users\\M1073173\\SeleniumStuff\\BDDBigSmall\\src\\test\\resources\\TestingData.xlsx", "testdata");

	@Then("^Click New from navigation bar$")
	public void click_new_from_navigation_bar() throws Throwable {
		log.info("Click New from Navigation bar");
		test.info("Click New from Navigation bar");
		obj.getNew().click();
	}

	@And("^Select the product from new$")
	public void select_the_product_from_new() throws Throwable {
		log.info("Select the product");
		test.info("Select the product");
		obj.getProduct().click();
	}

	@And("^Enter the pincode (.+) to check the COD$")
	public void enter_the_pincode_to_check_the_cod(String pincode) throws Throwable {
		log.info("On navigated Product details page");
		test.info("On navigated Product details page");
		log.info("Input the pincode for selected product");
		test.info("Input the pincode for selected product");
		obj.getPin().sendKeys(pincode);
		log.info("Check the COD available for inputed pin code");
		test.info("Check the COD available for inputed pin code");
		obj.getCheckPin().click();
	}

	@And("^Validate the message after checking$")
	public void validate_the_message_after_checking() throws Throwable {
		log.info("Check the COD available Message");
		test.info("Check the COD available Message");
		String msg = obj.getMessage().getText();
		try {
			Assert.assertEquals(msg, exe.getData(7, 1));
			log.info("COD Available for inputed pin code");
			test.info("COD Available for inputed pin code");
		} catch (AssertionError e) {
			log.error("COD Unavailable for inputed pin code");
			test.fail("COD Unavailable for inputed pin code");
		}
	}
}
