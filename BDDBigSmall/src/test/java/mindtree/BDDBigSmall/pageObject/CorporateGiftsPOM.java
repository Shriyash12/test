package mindtree.BDDBigSmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mindtree.BDDBigSmall.uiStore.CorporateGiftsUI;
import mindtree.BDDBigSmall.utility.BaseClass;

public class CorporateGiftsPOM extends BaseClass {

	public CorporateGiftsPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCorporategifts() {
		return driver.findElement(CorporateGiftsUI.clickCorporateGifts);
	}

	public WebElement getName() {
		return driver.findElement(CorporateGiftsUI.fillName);
	}

	public WebElement getEmail() {
		return driver.findElement(CorporateGiftsUI.fillEmail);
	}

	public WebElement getPhoneNo() {
		return driver.findElement(CorporateGiftsUI.fillPhoneNo);
	}

	public WebElement getinquiry() {
		return driver.findElement(CorporateGiftsUI.fillInquiry);
	}

	public WebElement getSubmit() {
		return driver.findElement(CorporateGiftsUI.clcikSubmit);
	}

}
