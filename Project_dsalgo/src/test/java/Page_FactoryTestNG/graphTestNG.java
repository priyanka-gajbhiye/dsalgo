package Page_FactoryTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class graphTestNG {
	public static WebDriver driver = BrowserManagerTestNG.getdriver();
	String home = "https://dsportalapp.herokuapp.com/home";
	String graph="https://dsportalapp.herokuapp.com/graph/";
	
	@FindBy (xpath="//a[@href='graph']") WebElement graphbtn;
	@FindBy (xpath="//a[@href='graph']") WebElement graphLink;
	@FindBy (xpath = "//a[text()='Try here>>>']") WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea" )WebElement text;
	@FindBy (xpath= "//button[text()='Run']") WebElement runbtn;
	@FindBy (xpath = "//a[text()='Graph Representations']") WebElement graphRepresentation;
	
		
	@Test (priority=4)
	public void main()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get(home);
	PageFactory.initElements(driver,this);
	
	graphbtn.click();
	graphLink.click();
	tryhere.click();
	text.sendKeys("print'Graph'");
	runbtn.click();
	driver.get(graph);
	graphRepresentation.click();
	tryhere.click();
	text.sendKeys("print'Graph Representation'");
	runbtn.click();
	
}

}
