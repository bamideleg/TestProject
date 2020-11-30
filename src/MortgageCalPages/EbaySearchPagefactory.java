
// page factory tutorial: https://www.youtube.com/watch?v=fUSl-WhqymU&t=2s

// Code 1 developed

package MortgageCalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EbaySearchPagefactory {

// You will need a constructor	
	WebDriver driver;
	
	public EbaySearchPagefactory(WebDriver driver) 
	{
		this.driver=driver;
	}
	
// Option 1	
//	@FindBy(id="_nkw") 
//	WebElement searchForProduct;
	
//Option 2	
	@FindBy(how=How.ID,using="_nkw") 
	WebElement searchForProduct;
			
	@FindBy(how=How.ID,using="gh-btn") 
	WebElement searchButton;
	
	@FindBy(how=How.CLASS_NAME,using="srp-controls__count-heading") 
	WebElement searchProductFound;
	

	
	public void searchProduct (String searchForItems ){
		searchForProduct.sendKeys(searchForItems);
		searchButton.click();
		searchProductFound.getText();
		

	}
	
}
