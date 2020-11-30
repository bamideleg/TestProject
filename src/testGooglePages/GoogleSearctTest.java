
//POM without page factory
//https://www.youtube.com/watch?v=w_iPCT1ETO4




package testGooglePages;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

import org.testng.annotations.Test;

//import GoogleTestCase.GoogleSearchPage;
import GoogleTestCase.GoogleSearchPage;


public class GoogleSearctTest {
	
//		private static WebDriver driver=null;
	
	
	private static final String FileUtils = null;
	static WebDriver driver;

	
	public static void main(String[] args) throws IOException {

	googlesearch();
	
    }

    public static void googlesearch() throws IOException {
    	

	String path = System.getProperty("user.dir");
	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\browserDriver1\\IEDriverServer.exe");
	//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\browserDriver1\\IEDriverServer.exe");		
	driver = new InternetExplorerDriver();
	
	
	
	//go to google
	driver.get("https://www.google.com");
	// Enter search keyword
	//driver.findElement(By.name("q")).sendKeys("books");
	
    GoogleSearchPage.GoogleTextBox(driver).sendKeys("Amazon");
	System.out.println("user successfully search on the page");
	takesScreenshot("AmazonSearchBox");
	
	GoogleSearchPage.SearchButton(driver).click();
//	GoogleSearchPage.SearchButton(driver).sendKeys(Keys.RETURN);

	takesScreenshot("AmazonSearchResult");
	
	
//	driver.close();

     }    
    // https://www.youtube.com/watch?v=NAnYJcb0G40
    
    public static void takesScreenshot (String filename) throws IOException {    	
// Take screenshot and store is as a file format		
//		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// Copy the screenshot into a desire location using copyfile	

 //      FileUtils.copyFile(file, new File ("C:/Users/Allogogate/workspace/SeleniumDataDrivenFramework/Screenshots" + filename+".png"))	;
    	FileHandler.copy(file, new File ("C:/Users/Allogogate/workspace/SeleniumWebdriverPOMProject/ScreenShot/" +filename+".png"));
    }
}
