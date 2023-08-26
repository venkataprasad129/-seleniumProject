package Chapter_03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class create_row_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis= new FileInputStream("./src/test/resources/excel_1_selenium.xlsx");
		
		
		Workbook workbook= WorkbookFactory.create(fis);
		
		
		Sheet sheet=workbook.getSheet("Sheet1");
		
		Row row= sheet.createRow(4);
		
		Cell cell= row.createCell(0);
		
		cell.setCellValue("username2");
		
		FileOutputStream fos= new FileOutputStream("./src/test/resources/excel_1_selenium.xlsx");
		
		workbook.write(fos);
		
		workbook.close();
		
	}

}
