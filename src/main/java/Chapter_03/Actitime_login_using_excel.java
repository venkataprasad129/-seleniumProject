package Chapter_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime_login_using_excel {

	public static void main(String[] args) {
		Map<String ,String> map = getData();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().minimize();
		driver.get(map.get("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong("time")));
		
		driver.findElement(By.id("username")).sendKeys(map.get("username"));
		driver.findElement(By.name("pwd")).sendKeys(map.get("password"));
		driver.findElement(By.id("loginbutton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(Long.parseLong(map.get("time"))));
		 try
		 {
			 wait.until(ExpectedConditions.titleContains("enter the time-track"));
			 System.out.println("pass");
		 }
		 catch(Exception e)
		 {
			 System.out.println("fail");
		 }
		 
		driver.quit();
	}
		 
		 public static Map<String,String> getData()
		 {
			Map<String , String> map= new HashMap<String , String>();
			DataFormatter df =new DataFormatter();
			
			FileInputStream fis=null;
			
			try
			{
				fis= new FileInputStream("./src/test/resources/excel_1_selenium.xlsx\"");
						
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			Workbook workbook =null;
			try
			{
				workbook =WorkbookFactory.create(fis);
			}
			catch(EncryptedDocumentException | IOException e)
			
			{
				e.printStackTrace();
			}
			Sheet sheet =workbook.getSheet("Sheet1");
			
			for(int i=0;i<=sheet.getLastRowNum();i++)
			{
				String key =df.formatCellValue(sheet.getRow(i).getCell(0));
				String value =df.formatCellValue(sheet.getRow(i).getCell(0));
				map.put(key, value);
			}
			System.out.println(map);
			return map;
		 
		
		
		

	

	
		
	}

}