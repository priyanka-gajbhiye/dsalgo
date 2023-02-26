package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Page_Factory.BrowserManager;
import utilities.ConfigfileReader;
import utilities.ExcelReader;

public class login_page {
	 public static WebDriver driver=BrowserManager.getdriver();
	 String url=ConfigfileReader.getApplicationUrl();
	 //String browser=ConfigfileReader.getBrowserType();
	 ExcelReader read = new ExcelReader();
	 
	@FindBy (xpath  = "//a/button") WebElement getstarted ;
	@FindBy (xpath = "//a[text()='Sign in']") WebElement signin;
	@FindBy (xpath = "//input[@id='id_username']")static WebElement username;
	@FindBy (xpath = "//input[@id='id_password']")static WebElement password;
	@FindBy (xpath = "//*[@value='Login']") static WebElement loginbtn;
	
	public  void loginpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void url() {
		driver.get(url);
	} 
    public void getstarted() {
    	getstarted.click();
    		
    }
    public void Sign_in() {
    	signin.click();
    }
    
    public void ID() throws Exception {
    	String excelusername=read.getExcelusername();
    	String excelpassword=read.getExcelpassword();
    	
    	username.sendKeys(excelusername);
    	password.sendKeys(excelpassword);
    	Thread.sleep(2000);
    	
    }

    public void login_click() {
    	loginbtn.click();	
    }
    
	

}
