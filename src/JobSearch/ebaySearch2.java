

package JobSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ebaySearch2 {
	
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
		wb.get("https://www.google.com");
		System.out.println("Internet driver is working as expected");
		
		System.out.println("Code updated and checked into Git");
		
		wb.close();
		
	}
}
