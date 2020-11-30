
// 
// page factory tutorial: https://www.youtube.com/watch?v=fUSl-WhqymU&t=2s
// Code 2 developed 

package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class browserFactory {
	
	static WebDriver driver;
// We need to return the driver by changing the void to WebDriver
//	Public void startBrowser(String browserName) {
// We will pass the url as String, so what the url the user pass, it will be reference.
// We make the code static	
	
	public static WebDriver startBrowser(String browserName, String url) {	
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\browserDriver1\\IEDriverServer.exe");
		
		if(browserName.equalsIgnoreCase("Firefox")) 
		{
			driver = new FirefoxDriver ();
		   
		}
		else if(browserName.equalsIgnoreCase("IE")) 
		{		

			driver = new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome")) {
			
			driver= new ChromeDriver();			
		}
		 driver.manage().window().maximize();
		 driver.get(url);
		 
		 return driver;
	}
}
