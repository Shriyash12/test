package mindtree.BDDBigSmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mindtree.BDDBigSmall.uiStore.SearchProductUI;
import mindtree.BDDBigSmall.utility.BaseClass;

public class SearchProductPOM extends BaseClass {

	public SearchProductPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchBar() {
		return driver.findElement(SearchProductUI.searchBox);
	}

	public WebElement getProduct() {
		return driver.findElement(SearchProductUI.selectProduct);
	}

	public WebElement getTitle() {
		return driver.findElement(SearchProductUI.productName);
	}
}
