import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

	By searchBoxLocator=By.id("twotabsearchtextbox");
	By submitButtonLocator=By.id("nav-search-submit-button");
	public SearchBox(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void search(String text) {
		// TODO Auto-generated method stub
		type(searchBoxLocator,text);
		click(submitButtonLocator);
		
	}

}
