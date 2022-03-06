import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {
	
	By shippingOptionLocator=By.id("p_n_free_shipping_eligible-title");
    By productNameLocator=new By.ByCssSelector("span.a-size-base-plus");
	public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean isOnProductPage() {
		// TODO Auto-generated method stub
		return isDisplayed(shippingOptionLocator);
	}

	public void selectProduct(int i) {
		// TODO Auto-generated method stub
		getAllProducts().get(i).click();
	}
	private List<WebElement> getAllProducts(){
		return findAll(productNameLocator);
	}


}
