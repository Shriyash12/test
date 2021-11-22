package mindtree.BDDBigSmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mindtree.BDDBigSmall.uiStore.BuyProductUI;
import mindtree.BDDBigSmall.utility.BaseClass;

public class BuyProductPOM extends BaseClass {

	public BuyProductPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getclickSearchBar() {
		return driver.findElement(BuyProductUI.searchBar);
	}

	public WebElement getFirstProduct() {
		return driver.findElement(BuyProductUI.selectFirstProduct);
	}

	public WebElement getCart() {
		return driver.findElement(BuyProductUI.addToCart);
	}

	public WebElement getCheckout() {
		return driver.findElement(BuyProductUI.clickGoToCheckout);
	}

	public WebElement getWhatsapp() {
		return driver.findElement(BuyProductUI.cutWhatsapp);
	}

	public WebElement getEmail() {
		return driver.findElement(BuyProductUI.fillEmail);
	}

	public WebElement getFirstNmae() {
		return driver.findElement(BuyProductUI.fillFirstName);
	}

	public WebElement getLastNmae() {
		return driver.findElement(BuyProductUI.fillLastName);
	}

	public WebElement getAddress() {
		return driver.findElement(BuyProductUI.fillAddress);
	}

	public WebElement getLandmark() {
		return driver.findElement(BuyProductUI.fillLandmark);
	}

	public WebElement getCity() {
		return driver.findElement(BuyProductUI.fillCity);
	}

	public WebElement getState() {
		return driver.findElement(BuyProductUI.selectState);
	}

	public WebElement getPinCode() {
		return driver.findElement(BuyProductUI.fillPinCode);
	}

	public WebElement getPhoneNo() {
		return driver.findElement(BuyProductUI.fillPhoneNo);
	}

	public WebElement getContinueShipping() {
		return driver.findElement(BuyProductUI.clickContinueShipping);
	}

}
