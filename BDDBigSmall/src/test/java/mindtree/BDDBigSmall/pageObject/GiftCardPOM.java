package mindtree.BDDBigSmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mindtree.BDDBigSmall.uiStore.GiftCardUI;
import mindtree.BDDBigSmall.utility.BaseClass;

public class GiftCardPOM extends BaseClass {

	public GiftCardPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getGiftCard() {
		return driver.findElement(GiftCardUI.clickGiftCard);
	}

	public WebElement getAmount() {
		return driver.findElement(GiftCardUI.selectAmount);
	}

	public WebElement getCart() {
		return driver.findElement(GiftCardUI.addToCart);
	}

}
