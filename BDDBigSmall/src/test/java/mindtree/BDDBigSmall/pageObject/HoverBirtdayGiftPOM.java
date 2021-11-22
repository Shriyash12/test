package mindtree.BDDBigSmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mindtree.BDDBigSmall.uiStore.HoverBirthdayGiftsUI;
import mindtree.BDDBigSmall.utility.BaseClass;

public class HoverBirtdayGiftPOM extends BaseClass {

	public HoverBirtdayGiftPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getBirthdayGifts() {
		return driver.findElement(HoverBirthdayGiftsUI.hoverBday);
	}

	public WebElement getOptionDropdown() {
		return driver.findElement(HoverBirthdayGiftsUI.selectOpt);
	}

	public WebElement getProduct() {
		return driver.findElement(HoverBirthdayGiftsUI.selectProduct);
	}

	public WebElement getProductVariety() {
		return driver.findElement(HoverBirthdayGiftsUI.selectProductOption);
	}

	public WebElement getAddToCart() {
		return driver.findElement(HoverBirthdayGiftsUI.addToCart);
	}
}
