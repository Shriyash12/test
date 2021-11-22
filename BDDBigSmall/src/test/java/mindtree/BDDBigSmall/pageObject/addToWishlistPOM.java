package mindtree.BDDBigSmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mindtree.BDDBigSmall.uiStore.addToWishlistUI;
import mindtree.BDDBigSmall.utility.BaseClass;

public class addToWishlistPOM extends BaseClass {

	public addToWishlistPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTop50() {
		return driver.findElement(addToWishlistUI.top50);
	}

	public WebElement getProduct() {
		return driver.findElement(addToWishlistUI.selectProduct);
	}

	public WebElement getAddtoWishlist() {
		return driver.findElement(addToWishlistUI.addToWishlist);
	}

	public WebElement getWishlist() {
		return driver.findElement(addToWishlistUI.selectWishlist);
	}

	public WebElement getContinueWishlist() {
		return driver.findElement(addToWishlistUI.continueWishlist);
	}

	public WebElement getAddToCart() {
		return driver.findElement(addToWishlistUI.addToCart);
	}
}
