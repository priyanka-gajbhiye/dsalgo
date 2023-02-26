package Page_FactoryTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Page_FactoryTestNG.BrowserManagerTestNG;
import Page_FactoryTestNG.Data_StructureTestNG;

public class ArrayTestNG {
	public static WebDriver driver = BrowserManagerTestNG.getdriver();
	
	@FindBy (xpath = "//a[@class='nav-link dropdown-toggle']") WebElement datastucture;
	@FindBy (xpath = "//a[text()='Arrays']") WebElement arrays;
	@FindBy (xpath = "//a[text()='Arrays in Python']") WebElement arraysel ;
	@FindBy (xpath = "//a[text()='Try here>>>']") WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement print ;
	@FindBy (xpath = "//button[text()='Run']") WebElement run;
	@FindBy (xpath = "//a[text()='Practice Questions']") WebElement practicequestion;
	@FindBy (xpath = "//a[text()='Search the array']") WebElement searcharray;
	@FindBy (xpath = "//a[text()='Sign out']") WebElement signout;
	
	@Test(priority=3)
	public void Array() throws InterruptedException {
		
		//PageFactory.initElements(driver, this);
		
		datastucture.click();
		arrays.click();
		Thread.sleep(1000);
		arraysel.click();
		Thread.sleep(1000);
		tryhere.click();
		print.sendKeys("print'Hello world'");
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		practicequestion.click();
		searcharray.click();
		print.clear();
		print.sendKeys("print'Hello world'");
		run.click();
		driver.navigate().back();
		signout.click();
		
	}
	

}
