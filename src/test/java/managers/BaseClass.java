package managers;

import org.openqa.selenium.WebDriver;

import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductListingPage;

public class BaseClass {
		WebDriver driver;
		ProductListingPage productListingPage;
		CartPage cartPage;
		HomePage homePage;
		CheckoutPage checkoutPage;
	 
		public BaseClass(WebDriver driver) {
			this.driver = driver;
		}
	 
		public HomePage getHomePage() {
			return (homePage == null) ? new HomePage(driver) : homePage;
		}
	 
		public ProductListingPage getProductListingPage() {
			return (productListingPage == null) ? new ProductListingPage(driver) : productListingPage;
		}
	 
		public CartPage getCartPage() {
			return (cartPage == null) ? new CartPage(driver) : cartPage;
		}
	 
		public CheckoutPage getCheckoutPage() {
			return (checkoutPage == null) ? new CheckoutPage(driver) : checkoutPage;
		}
	}
