package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Page_Factory.BrowserManager;
import utilities.ConfigfileReader;


public class Data_Structure extends BrowserManager {
	
	String homeurl = ConfigfileReader.getHomePage();
	public static login_page loginobj = new login_page();
	
	public static WebDriver driver=BrowserManager.getdriver();
	
	@FindBy (xpath = "//a[@href='data-structures-introduction']")  WebElement dataSbtn;
	@FindBy (xpath = "//a[text()='Time Complexity']") static WebElement timeC;
	@FindBy (xpath = "//a[text()='Try here>>>']") static WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") static WebElement print ;
	@FindBy (xpath = "//button[text()='Run']") static WebElement run;
	
	public void datastructure() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void getstartedDS() {
		//loginobj.click(getdriver(),dataSbtn);
		dataSbtn.click();
	}
	
	public void timec() {
		timeC.click();
	}
	
	public void tryhere() {
		tryhere.click();
		
	}
	
	public void print() {
		print.sendKeys("print'Hello world'");
	}
		
	public void runbutton() throws Exception {
			run.click();
			Thread.sleep(2000);
		}
		
	public void homepage() {
			driver.get(homeurl);
		}
		
	}
	


