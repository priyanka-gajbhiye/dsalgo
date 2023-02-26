package Page_FactoryTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TreeTestNG {
	public static WebDriver driver = BrowserManagerTestNG.getdriver();
	String home = "https://dsportalapp.herokuapp.com/home";
	String tree = "https://dsportalapp.herokuapp.com/tree/";
	
	@FindBy (xpath = "//a[@href='tree']") WebElement treebtn;
	@FindBy (xpath = "//a[text()='Overview of Trees']") WebElement overview;
	@FindBy (xpath = "//a[text()='Try here>>>']") WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea" )WebElement text;
	@FindBy (xpath = "//button[text()='Run']") WebElement runbtn;
	@FindBy (xpath = "//a[text()='Terminologies']") WebElement terminologies;
	@FindBy (xpath = "//a[text()='Types of Trees']") WebElement typesOfTrees;
	@FindBy (xpath = "//a[text()='Tree Traversals']") WebElement treeTraversals;
	@FindBy (xpath = "//a[text()='Traversals-Illustration']") WebElement traversalsIllustration;
	@FindBy (xpath = "//a[text()='Binary Trees']" )WebElement binaryTrees;
	@FindBy (xpath= "//a[text()='Types of Binary Trees']") WebElement typesOfBinaryTrees;
	@FindBy (xpath = "//a[text()='Implementation in Python']") WebElement implementationInPython;
	@FindBy (xpath = "//a[text()='Applications of Binary trees']") WebElement applicationsOfBinaryTrees;
	@FindBy (xpath = "//a[text()='Binary Search Trees']") WebElement binarySearchTrees;
	@FindBy (xpath = "//a[text()='Implementation Of BST']")WebElement implementationOfBST;
	
	
	
	
	@Test (priority=3)
	public void main()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(home);
	
	PageFactory.initElements(driver,this);
	treebtn.click();
	overview.click();
	tryhere.click();
	text.sendKeys("print'Overview of Trees'");
	runbtn.click();	
	driver.get(tree);
	terminologies.click();
	tryhere.click();
	text.sendKeys("print'Terminologies'");
	runbtn.click();
	driver.get(tree);
	typesOfTrees.click();
	tryhere.click();
	text.sendKeys("print'Types Of Trees'");
	runbtn.click();
	driver.get(tree);
	treeTraversals.click();
	tryhere.click();
	text.sendKeys("print'Tree Traversals'");
	runbtn.click();	
	driver.get(tree);
	traversalsIllustration.click();
	tryhere.click();
	text.sendKeys("print'Traversals Illustration'");
	runbtn.click();
	driver.get(tree);
	binaryTrees.click();
	tryhere.click();
	text.sendKeys("print'Binary Trees'");
	runbtn.click();	
	driver.get(tree);
	typesOfBinaryTrees.click();
	tryhere.click();
	text.sendKeys("print'Types Of Binary Trees'");
	runbtn.click();	
	driver.get(tree);
	implementationInPython.click();
	tryhere.click();
	text.sendKeys("print'Implementation In Python'");
	runbtn.click();	
	driver.get(tree);
	applicationsOfBinaryTrees.click();
	tryhere.click();
	text.sendKeys("print'Applications Of BinaryTrees'");
	runbtn.click();	
	driver.get(tree);
	binarySearchTrees.click();
	tryhere.click();
	text.sendKeys("print'Binary Search Trees'");
	runbtn.click();	
	driver.get(tree);
	implementationOfBST.click();
	tryhere.click();
	text.sendKeys("print'Implementation Of BST'");
	runbtn.click();	
	
	
	}

}
