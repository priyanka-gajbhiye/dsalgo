package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;

public class Graph {
	
	public static WebDriver driver=BrowserManager.getdriver();
	String homeurl = ConfigfileReader.getHomePage();
	
	@FindBy (xpath="//a[@href='graph']") WebElement graphbtn;
	@FindBy (xpath="//a[@href='graph']") WebElement graphLink;
	@FindBy (xpath = "//a[text()='Try here>>>']") WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea" )WebElement text;
	@FindBy (xpath= "//button[text()='Run']") WebElement runbtn;
	@FindBy (xpath = "//a[text()='Graph Representations']") WebElement graphRepresentation;
	
		public void graph() {
	PageFactory.initElements(driver,this);
		}
		public void homeurl() {
			driver.get(homeurl);
		}
		public void getstartedgraph() {
			
		
	graphbtn.click();
	graphLink.click();
	tryhere.click();
	text.sendKeys("print'Graph'");
	runbtn.click();
	
	graphRepresentation.click();
	tryhere.click();
	text.sendKeys("print'Graph Representation'");
	runbtn.click();

}
}
