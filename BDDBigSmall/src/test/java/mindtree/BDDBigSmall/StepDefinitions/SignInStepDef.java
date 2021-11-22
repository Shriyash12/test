package mindtree.BDDBigSmall.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mindtree.BDDBigSmall.pageObject.SignInPOM;
import mindtree.BDDBigSmall.utility.BaseClass;
import mindtree.BDDBigSmall.utility.ExcelInitialization;

public class SignInStepDef extends BaseClass {
	public static Logger log = LogManager.getLogger(SignInStepDef.class.getName());

	ExcelInitialization exe = new ExcelInitialization(
			"C:\\Users\\M1073173\\SeleniumStuff\\BDDBigSmall\\src\\test\\resources\\TestingData.xlsx", "testdata");

	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
		log.info("Opening the browser");
		test.info("Opening the browser");
		driver = initializeBrowser();
		log.info("Browser opened");
		test.info("Browser opened");
	}

	SignInPOM obj = new SignInPOM(driver);

	@When("^User will land to homepage$")
	public void user_will_land_to_homepage() throws Throwable {
		log.info("User Landed to Landing page");
		test.info("User Landed to Landing page");
	}

	@Then("^Click on Signin option in header section$")
	public void click_on_signin_option_in_header_section() throws Throwable {

		obj.getSignInButton().click();
	}

	@And("^Enter URL in searchbar$")
	public void enter_url_in_searchbar() throws Throwable {
		log.info("Entering URL in search bar of browser");
		test.info("Entering URL in search bar of browser");
		driver.get(prop.getProperty("url"));
		log.info("Loading Website of Bigsmall.in");
		test.info("Loading Website of Bigsmall.in");
	}

	@Then("^Signin form will be open$")
	public void signin_form_will_be_open() throws Throwable {
		log.info("Opening Signin Form");
		test.info("Opening Signin Form");
	}

	@And("^Enter username and password in respective fields$")
	public void enter_username_and_password_in_respective_fields() throws Throwable {
		log.info("Input email in username field");
		test.info("Input email in username field");
		obj.getEmail().sendKeys(exe.getData(1, 1));
		log.info("Input password in password field");
		test.info("Input password in password field");
		obj.getPassword().sendKeys(exe.getData(2, 1));
	}

	@And("^Click on SignIn button$")
	public void click_on_signin_button() throws Throwable {
		log.info("Signing Inn with credentials");
		test.info("Signing Inn with credentials");
		obj.getSignIn().click();
		log.info("SignedIn Sucessfull!!");
		test.info("SignedIn Sucessfull!!");
	}

	@And("^Close the Browser$")
	public void close_the_browser() throws Throwable {
		log.info("Closing the browser...");
		test.info("Closing the browser...");
		log.info("Browser Closed.");
		test.info("Browser Closed.");

	}

}