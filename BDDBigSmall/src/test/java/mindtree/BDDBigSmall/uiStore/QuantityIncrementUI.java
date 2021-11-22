package mindtree.BDDBigSmall.uiStore;

import org.openqa.selenium.By;

public class QuantityIncrementUI {
	public static By santaGifts = By.xpath("//a[@data-dropdown-rel='secret-santa-gifts']");
	public static By selectProduct = By.xpath("//div[@id='CollectionAjaxContent']//div[@class='grid-product__meta']");
	public static By QtyPlus = By.xpath("//div[@class='quantitybox']/div/span");
	public static By addtoCart=By.xpath("//button[@class='btn btn--full add-to-cart spice-submit-button']");
}
