package Page_FactoryTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page_FactoryTestNG.LoginTestNG;


public class Data_StructureTestNG extends LoginTestNG{

	//LoginTestNG login = new LoginTestNG();
	
	//public static WebDriver driver = BrowserManagerTestNG.getdriver();
	
	@FindBy (xpath = "//h5[text()='Data Structures-Introduction']/../a[1]") WebElement dataSbtn;
	@FindBy (xpath = "//a[text()='Time Complexity']") WebElement timeC;
	@FindBy (xpath = "//a[text()='Try here>>>']") WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement print ;
	@FindBy (xpath = "//button[text()='Run']") WebElement run;
	
	
	@Test(priority =2)
	public void datastucture() throws InterruptedException {
		
		PageFactory.initElements(driver, this);
		
		dataSbtn.click();
		timeC.click();
		tryhere.click();
		print.sendKeys("print'Hello world'");
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	
	}
	
}
