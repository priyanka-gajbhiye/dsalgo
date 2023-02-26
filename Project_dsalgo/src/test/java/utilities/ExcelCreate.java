package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


import Page_Factory.BrowserManager;

public class ExcelCreate {
	
	 public static WebDriver driver=BrowserManager.getdriver();
	 //String Excelpath= ConfigfileReader.getexcelfilepath();
	 
	 public static void main(String[] args)  throws Exception {
		
	
	 
	HSSFWorkbook workbook = new HSSFWorkbook();
	HSSFSheet sheet = workbook.createSheet("TestSheet");
	sheet.createRow(0);
	sheet.getRow(0).createCell(0).setCellValue("username");
	sheet.getRow(0).createCell(1).setCellValue("password");
	
	    sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("dsalgoproject1");
		sheet.getRow(1).createCell(1).setCellValue("DS@algo123");
 
		File file = new File("C:\\Users\\priya\\eclipse-workspace\\Project_dsalgo\\src\\test\\resources\\ExcelData\\LoginInput1.xlsx");
		workbook.write(file);
		workbook.close();
	 }
}