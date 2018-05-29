package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {
	private WebDriver driver;
	public ProductListingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "button.single_add_to_cart_button") 
	private WebElement btnAddToCart;
	
	@FindAll(@FindBy(css = ".noo-product-inner"))
	private List<WebElement> prd_List;	
	
	public void clickOnAddToCart() {
		btnAddToCart.click();
	}
	
	public void selectProduct(int productNumber) {
		prd_List.get(productNumber).click();
	}
 
}
