package Page_FactoryTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManagerTestNG {
	
	static String url = "https://dsportalapp.herokuapp.com/";
	public static WebDriver driver;

	public static WebDriver initializeDrivers(String browser) {
		
		if (browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	
	}
    
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub
		return driver;
	}

	public static String url() {
		// TODO Auto-generated method stub
		return url;
	}
	}

