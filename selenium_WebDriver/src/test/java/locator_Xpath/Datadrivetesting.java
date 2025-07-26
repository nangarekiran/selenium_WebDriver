package locator_Xpath;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Datadrivetesting {

	//public static void main(String[] args) throws IOException {
	@Test
	
		public void excelFIle() throws IOException {
		FileInputStream file=new FileInputStream("C:\\MasterAniket\\Eclipse Workspace\\groceryworkspace\\selenium_WebDriver\\testdata\\Account Statement.xlsx");// xlsx file reading 
		XSSFWorkbook workbook=new XSSFWorkbook(file);// Taking file from the system
		XSSFSheet Sheet=workbook.getSheet("Table 1");// locating the sheet from the systems.
		int total=Sheet.getLastRowNum();
		int totalcell=Sheet.getRow(1).getLastCellNum();
		System.out.println(total);
		System.out.println(totalcell);
		}
}
