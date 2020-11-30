// page factory tutorial: https://www.youtube.com/watch?v=fUSl-WhqymU&t=2s 


package MortgageCalPages;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class MortgageCalNew {
	
	static WebDriver driver;
	
	
	public MortgageCalNew (WebDriver driver) 
	{
		
		this.driver=driver;
	}
	
	
	@FindBy(how=How.ID,using="homeval") 
	WebElement Homevalue;
	
	@FindBy(how=How.ID,using="downpayment") 
	WebElement downpayment;
	
	@FindBy(how=How.ID,using="loanamt") 
	WebElement LoanAmount;
	
	@FindBy(how=How.ID,using="intrstsrate") 
	WebElement interestrate;
	
	@FindBy(how=How.ID,using="loanterm") 
	WebElement loanterm;
	
	@FindBy(how=How.NAME,using="param[start_month]") 
	WebElement StartMonth;
	
	@FindBy(how=How.ID,using="start_year") 
	WebElement startYear;
	
	@FindBy(how=How.ID,using="pptytax") 
	WebElement pptytax;
	
	@FindBy(how=How.ID,using="pmi") 
	WebElement pmi;
	
	@FindBy(how=How.ID,using="hoi") 
	WebElement homeInsurance;
	
	@FindBy(how=How.NAME,using="param[milserve]") 
	WebElement LoanType;
	
	@FindBy(how=How.NAME,using="param[refiorbuy]") 
	WebElement BuyOrRefinance;
	
	@FindBy(how=How.ID,using="credit_rating") 
	WebElement CreditRating;
	
	@FindBy(how=How.NAME,using="cal") 
	WebElement submitButton;
	
	@FindBy(how=How.CSS,using=".rw-box:nth-child(1) > .left-cell > h3") 
	WebElement MonthlyPayment;
	
	@FindBy(how=How.CSS,using=".rw-box:nth-child(7) > .right-cell > h3")
	
// It is used to store the test object in the memory. it is really good when you are sure Weblement will not change	
	@CacheLookup
	WebElement TotalPayment;
	
	
	public void CalMortgage (String ValueOfTheHome, String Deposit, String InterestRate, String Term, String StartM, String StartY, String Ptax, String PMI, String homeIns, String LoanT, String BuyOrR, String CreditR) throws IOException {
		
		Homevalue.sendKeys(ValueOfTheHome);
		
		downpayment.sendKeys(Deposit);
		
		interestrate.sendKeys(InterestRate);
		
		loanterm.sendKeys(Term);
		
		StartMonth.sendKeys(StartM);
		
		startYear.sendKeys(StartY);
		
		pptytax.sendKeys(Ptax);
		
		pmi.sendKeys(PMI);
		
		homeInsurance.sendKeys(homeIns);
		
		LoanType.sendKeys(LoanT);
		
		BuyOrRefinance.sendKeys(BuyOrR);
		
		CreditRating.sendKeys(CreditR);
		
		submitButton.click();
		
// First validation		
// Verify monthly payment	
		
		try {
		String monthyPayment = MonthlyPayment.getText();
		System.out.println(" The expected monthly payment is " + monthyPayment);
		System.out.println(" Passed the test");
		 takesScreenshot("MonthlyPayment is present");
		
		}catch(Exception e) { 
			
			System.out.println(" Fail the test");	
			takesScreenshot("MonthlyPayment is not present");
		}
		
// Second validation		
		try {
		String totalPayment = TotalPayment.getText();
		System.out.println(" The expected total payment is " + totalPayment);		
		System.out.println(" Pass the test");	
		takesScreenshot("TotalPayment is present");
		
		}catch(Exception e) {
			System.out.println(" Fail the test");
			takesScreenshot("TotalPayment is not present");
		}
		 
	}	
	    public static void takesScreenshot (String filename) throws IOException {    	
	// Take screenshot and store is as a file format		
//			File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	
	    	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// Copy the screenshot into a desire location using copyfile	

	 //      FileUtils.copyFile(file, new File ("C:/Users/Allogogate/workspace/SeleniumDataDrivenFramework/Screenshots" + filename+".png"))	;
	    	FileHandler.copy(file, new File ("C:/Users/Allogogate/workspace/SeleniumWebdriverPOMProject/ScreenShot/" +filename+".png"));
	    
	
	}

}
