//POM without page factory
//https://www.youtube.com/watch?v=w_iPCT1ETO4


package GoogleTestCase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class GoogleSearchPage<TakeScreenshot> {
	
	static WebElement element = null;
	
	static WebDriver driver;
	
	public static WebElement GoogleTextBox (WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	public static WebElement SearchButton (WebDriver driver) {
		
		element = driver.findElement(By.name("btnK"));
		return element;		
	
	}
	
	
	
} 
		
	

 

  


