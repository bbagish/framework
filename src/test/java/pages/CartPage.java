package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	private WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".cart-button") 
	private WebElement btnCart;
	
	@FindBy(css= ".checkout-button.alt") 
	private WebElement btnContinueToCheckout;
	
	
	public void clickOnCart() {
		btnCart.click(); 
	}
	
	public void clickOnContinueToCheckout(){
		btnContinueToCheckout.click();
		try { Thread.sleep(5000);}
		catch (InterruptedException e) {}
	}
	
}
