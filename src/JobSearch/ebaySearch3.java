

package JobSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ebaySearch3 {
	
	public static void main(String[] args) {
		
		googlesearch ();
			
		}
	
		public static void googlesearch () {
			
// How to set multiple browser path in the same project package/folder			
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\browserDriver1\\IEDriverServer.exe");
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDriver1\\IEDriverServer.exe");		
		InternetExplorerDriver wb = new InternetExplorerDriver();
		
//		
		wb.get("https://www.ebay.com");
		System.out.println("Internet driver is working as expected");
	
		
		System.out.println(" EbaySearch Code 3 completed ");
		
		wb.close();
		
	}
}
