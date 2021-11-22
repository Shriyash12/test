package mindtree.BDDBigSmall.uiStore;

import org.openqa.selenium.By;

public class SearchProductUI {

	public static By searchBox = By.xpath("//input[@name='q']");
	public static By selectProduct = By.xpath("//div[@id='snize_results']//span[@class='snize-title']");
	public static By productName = By.xpath("//h1[@class='h1 product-single__title']");

}
