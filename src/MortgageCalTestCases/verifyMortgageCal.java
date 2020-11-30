

package MortgageCalTestCases;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.browserFactory;
import MortgageCalPages.MortgageCalNew;



public class verifyMortgageCal {
	
	static WebDriver driver;
	
	@Test
     public void verifyMortgageCal () throws IOException 
     
     {
		
  //     Launch the browser		
         WebDriver driver=browserFactory.startBrowser("IE", "https://www.mortgagecalculator.org/");
    	 
    
         
    // Give me the page which you want to initailized.
    // If you pass the MortgageCalNew.class, it will return the page object of the same class  
         
         MortgageCalNew Mortgage_Cal_pages =  PageFactory.initElements(driver, MortgageCalNew.class);
    
   // Calling the method 
   //  Mortgage_Cal_pages.CalMortgage(ValueOfTheHome, Deposit, InterestRate, Term, StartM, StartY, Ptax, PMI, homeIns, LoanT, BuyOrR, CreditR);
       Mortgage_Cal_pages.CalMortgage("540000","400000", "3.6", "30", "Apr", "2020", "2200", "1.0", "1200", "VA", "Buy", "Good");
   	    

       
       driver.quit();
    	 
     }
 
}
