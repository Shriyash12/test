package mindtree.BDDBigSmall.uiStore;

import org.openqa.selenium.By;

public class CheckingCodUI {
	public static By selectNew = By.xpath("//ul[@class='site-nav site-navigation small--hide']/li[3]");
	public static By selectFirstProduct = By.xpath("//div[@class='grid-product__content']");
	public static By inputPinCode = By.xpath("//input[@id='PostalCode']");
	public static By clickCheckPin = By.xpath("//button[@class='codbutton btn button']");
	public static By checkCOD = By.xpath("//p[@id='PostalCodeCheckerAvailability']");

}
