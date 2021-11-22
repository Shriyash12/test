package mindtree.BDDBigSmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mindtree.BDDBigSmall.uiStore.CheckingCodUI;
import mindtree.BDDBigSmall.utility.BaseClass;

public class CheckingCodPOM extends BaseClass {
	

	public CheckingCodPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getNew() {
		return driver.findElement(CheckingCodUI.selectNew);
	}

	public WebElement getProduct() {
		return driver.findElement(CheckingCodUI.selectFirstProduct);
	}

	public WebElement getPin() {
		return driver.findElement(CheckingCodUI.inputPinCode);
	}

	public WebElement getCheckPin() {
		return driver.findElement(CheckingCodUI.clickCheckPin);
	}

	public WebElement getMessage() {
		return driver.findElement(CheckingCodUI.checkCOD);
	}

}
