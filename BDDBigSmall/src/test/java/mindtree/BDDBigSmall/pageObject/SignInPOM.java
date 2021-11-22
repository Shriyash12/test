package mindtree.BDDBigSmall.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mindtree.BDDBigSmall.uiStore.SignInUI;
import mindtree.BDDBigSmall.utility.BaseClass;

public class SignInPOM extends BaseClass {

	public SignInPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSignInButton() {
		return driver.findElement(SignInUI.signinButton);
	}

	public WebElement getEmail() {
		return driver.findElement(SignInUI.email);
	}

	public WebElement getPassword() {
		return driver.findElement(SignInUI.password);
	}

	public WebElement getSignIn() {
		return driver.findElement(SignInUI.signin);
	}

}
