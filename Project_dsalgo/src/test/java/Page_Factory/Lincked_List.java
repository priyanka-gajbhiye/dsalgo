package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;

public class Lincked_List {

	public static WebDriver driver=BrowserManager.getdriver();
	String homeurl = ConfigfileReader.getHomePage();
	
	@FindBy (xpath  = "//a[@href='linked-list']") WebElement getstartedLinkedList ;
	@FindBy (xpath = "//a[@href='introduction']") WebElement introbutton;
	@FindBy (xpath = "//a[text()='Try here>>>']")static WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement printLL ;
	@FindBy (xpath = "//button[text()='Run']") WebElement run;
	@FindBy (xpath = "//a[text()='Creating Linked LIst']")static WebElement createLL;
	
	
	public void linkedlist() {
		PageFactory.initElements(driver, this);
	}
	public void Listhomeurl() {
		driver.get(homeurl);
	}
	public void getstartedLL() {
		getstartedLinkedList.click();
	}
	public void introduction() {
		introbutton.click();
	}
	public void tryhere() {
		tryhere.click();
	}
	public void printstatement() {
		printLL.sendKeys("print'Hello world'");
	}
	public void run() {
		run.click();
	}
	public void backLL() {
		driver.navigate().back();
	}
	public void createlinkedlist() {
		createLL.click();
	}
	public void tryhereLL() {
		tryhere.click();
	}
	public void printstatementLL() {
		printLL.sendKeys("print'Hello world'");
	}
	public void runLL() {
		run.click();
	}
	
}
