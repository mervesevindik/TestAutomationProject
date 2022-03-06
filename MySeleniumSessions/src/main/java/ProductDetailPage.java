import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
	
	By addToCartButtonLocator=By.id("add-to-cart-button");

	public ProductDetailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean isOnProductDetailPage() {
		// TODO Auto-generated method stub
		return isDisplayed(addToCartButtonLocator);
	}

	public void addToCart() {
		// TODO Auto-generated method stub
		click(addToCartButtonLocator);
		
	}

}
