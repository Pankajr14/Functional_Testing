package swaglab_test;

import org.testng.annotations.Test;

import swaglab_pages.LoginPage;
import swaglab_pages.ProductPage;

public class ProductsTest extends BaseClass{
	
	@Test (priority = 3)
	public void AddToCartTest() {
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "secret_sauce");
		
		ProductPage pp = new ProductPage();
		pp.AddToCart("Sauce Labs Bolt T-Shirt");
		
	}
}
