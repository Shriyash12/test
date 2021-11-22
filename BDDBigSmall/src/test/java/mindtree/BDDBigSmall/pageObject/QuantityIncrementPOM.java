package mindtree.BDDBigSmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mindtree.BDDBigSmall.uiStore.QuantityIncrementUI;
import mindtree.BDDBigSmall.utility.BaseClass;

public class QuantityIncrementPOM extends BaseClass {

	public QuantityIncrementPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSantaGifts() {
		return driver.findElement(QuantityIncrementUI.santaGifts);
	}

	public WebElement getProduct() {
		return driver.findElement(QuantityIncrementUI.selectProduct);
	}

	public WebElement getQty() {
		return driver.findElement(QuantityIncrementUI.QtyPlus);
	}

	public WebElement getAddToCart() {
		return driver.findElement(QuantityIncrementUI.addtoCart);
	}
}
