package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigfileReader {
	
	private static Properties properties;
	private final static String propertyFilePath = "./src/test/resources/config/config.properties";

	public static void loadConfig() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(" Not found Configuration.properties " + propertyFilePath);
		}
	}
	public static String getBrowserType() {
		String browser = properties.getProperty("browser");
		//Loggerload.info("Get property BrowserType");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not available. ");
	}

	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not available. ");
	}


	public static String getexcelfilepath() {
		String excelfilelpath = properties.getProperty("excelfilepath");
		if (excelfilelpath != null)
			return excelfilelpath;
		else
			throw new RuntimeException("Excel file path not available in the Config.properties file.");
	}
	
	public static String getHomePage() {
		String homeurl = properties.getProperty("homeurl");
		if (homeurl != null)
			return homeurl;
		else
			throw new RuntimeException("Homeurl not available in the Config.properties file.");
	}
	
	public static String getarrayprevious() {
		String arraybackurl = properties.getProperty("practicepage");
		if (arraybackurl != null)
			return arraybackurl;
		else
			throw new RuntimeException("This url not available in the Config.properties file.");
	}
}
