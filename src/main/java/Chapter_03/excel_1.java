package Chapter_03;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/excel_1_selenium.xlsx");
		
		
		Workbook workbook= WorkbookFactory.create(fis);
		
		
		Sheet sheet=workbook.getSheet("Sheet1");
		
		Row row=sheet.getRow(1);
		Row row2=sheet.getRow(3);
		
		Cell cell= row.getCell(1);
		Cell cell2= row2.getCell(1);
		
		System.out.println(cell.getStringCellValue());
		System.out.println(cell2.getNumericCellValue());
		
		workbook.close();
		
		

	}

}
