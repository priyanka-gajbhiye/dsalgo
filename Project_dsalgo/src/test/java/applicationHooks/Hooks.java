package applicationHooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Page_Factory.BrowserManager;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utilities.ConfigfileReader;
import utilities.Loggerload;

public class Hooks {
	
	private static WebDriver driver;
	private static BrowserManager browsermanager;
	static Scenario scenario;

	@BeforeAll
	public static void before() throws Throwable {
		
		ConfigfileReader.loadConfig();
		String browser = ConfigfileReader.getBrowserType();
		
		
		browsermanager = new BrowserManager();
		driver = browsermanager.initializeDrivers(browser);
		
	}

}
