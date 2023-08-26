package Generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	private Workbook workbook;
	private DataFormatter df;
	
	public void excelInitialization(String excelpath) 
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream(excelpath);
		}
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		try
		{
			workbook = WorkbookFactory.create(fis);
		}
		catch(EncryptedDocumentException|IOException e) 
		{
			e.printStackTrace();
		}
	}
	public String readFromExcel(String sheetName, int rowNum, int collNum) 
	{
		df= new DataFormatter();
		return df.formatCellValue(workbook.getSheet(sheetName).getRow(rowNum).getCell(collNum));
				
		
		
	}
	public Map<String,String>readFormatExcel(String sheetName, String expectedTestName)
	{
		Map<String,String> map=new HashMap<String,String>();
		df = new DataFormatter();
		Sheet sheet= workbook.getSheet(sheetName);
		
		for(int i= 0;i<=sheet.getLastRowNum();i++) 
		{
			if(df.formatCellValue(sheet.getRow(i).getCell(1)).equals(expectedTestName)) 
			{
				for(int j=i;j<=sheet.getLastRowNum();j++) 
				{
					map.put(df.formatCellValue(sheet.getRow(j).getCell(2)),
							df.formatCellValue(sheet.getRow(j).getCell(3)));
					if(df.formatCellValue(sheet.getRow(j).getCell(2)).equals("####"))
						break;
				}
				break;
			}
		}
		return map;
		}


public void writeToExcel(String sheetName, String expectedTestName, String status, String excelpath) 
{
	Sheet sheet =workbook.getSheet(sheetName);
	
	for (int i=0;i<=sheet.getLastRowNum();i++) 
	{
		if(df.formatCellValue(sheet.getRow(i).getCell(1)).equals(expectedTestName)) 
		{
		Cell cell=sheet.getRow(i).createCell(4);
			
	
		cell.setCellValue(status);
		break;

	
}
	}
FileOutputStream fos=null;
try
{
	fos= new FileOutputStream(excelpath);
}
catch(FileNotFoundException e) 
{
	e.printStackTrace();
}
try 
{
	workbook.write(fos);
}
catch(IOException e) 
{
	e.printStackTrace();
}
}
public void closeExcel()
{
	try 
	{
		workbook.close();
	}
	catch(IOException e) 
	{
		e.printStackTrace();
	}
}
}