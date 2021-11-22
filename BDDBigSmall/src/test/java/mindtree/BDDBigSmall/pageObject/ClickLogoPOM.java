package mindtree.BDDBigSmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mindtree.BDDBigSmall.uiStore.ClickLogoUI;
import mindtree.BDDBigSmall.utility.BaseClass;

public class ClickLogoPOM extends BaseClass {

	public ClickLogoPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAllofIt() {
		return driver.findElement(ClickLogoUI.clickAllOfIt);
	}

	public WebElement getFirstProduct() {
		return driver.findElement(ClickLogoUI.selectFirstProduct);
	}

	public WebElement getHomePage() {
		return driver.findElement(ClickLogoUI.backToHomePage);
	}

}
