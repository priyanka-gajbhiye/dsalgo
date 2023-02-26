package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import Page_Factory.BrowserManager;

public class ExcelReader {

	public static WebDriver driver=BrowserManager.getdriver();
	
	
	
	public String getExcelusername () throws Exception  {
		File file = new File("C:\\Users\\priya\\eclipse-workspace\\Project_dsalgo\\src\\test\\resources\\ExcelData\\LoginInput.xls");
	    FileInputStream fis = new FileInputStream(file);
	    HSSFWorkbook workbook = new HSSFWorkbook(fis);
	    HSSFSheet sheet = workbook.getSheetAt(0);
	    String cell0 = sheet.getRow(1).getCell(0).getStringCellValue();
	    return cell0;
	}
	
	public String getExcelpassword() throws Exception {
		File file = new File("C:\\Users\\priya\\eclipse-workspace\\Project_dsalgo\\src\\test\\resources\\ExcelData\\LoginInput.xls");
		FileInputStream fis = new FileInputStream(file);
	    HSSFWorkbook workbook = new HSSFWorkbook(fis);
	    HSSFSheet sheet = workbook.getSheetAt(0);
		String cell1=sheet.getRow(1).getCell(1).getStringCellValue();
		return cell1;
		
	}
}
