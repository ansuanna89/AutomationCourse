package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	static FileInputStream f; // Class used To Open/Aceess excel file
	static XSSFWorkbook wb; // Class used To access the workbook
	static XSSFSheet sh; // Class used to represent a sheet inside the workbook

	public static String getStringData(int a, int b, String sheet) throws IOException // a for row and b for cell
	{
		f = new FileInputStream("C:\\Users\\mathe\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\TestData.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet); // getSheet a method used to get the details from the Sheet1
		XSSFRow r = sh.getRow(a); // XSSFRow is a class for getting details from the Row and getRow() is a method
		XSSFCell c = r.getCell(b); // XSSFCell is a class for getting details from a cell
		return c.getStringCellValue(); // method used to get string value from a cell
	}

	public static String getIntegerData(int a, int b, String sheet) throws IOException {
		f = new FileInputStream("C:\\Users\\mathe\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\TestData.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int cellval = (int) c.getNumericCellValue(); // To get the numeric value from a cell

		return String.valueOf(cellval); // To convert integer data type to String

	}

}
