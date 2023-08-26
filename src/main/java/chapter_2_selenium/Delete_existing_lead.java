package chapter_2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_existing_lead {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  if(driver.getTitle().contains("vtiger"))
			  System.out.println("login page displayed");
		  else
			  System.out.println("login page not found");
		  
		  
		  driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("venkat");
	 driver.findElement(By.id("submitButton")).submit();
	 
	 if(driver.getTitle().contains("Home"))
	 System.out.println("home page is displayed");
	 else
		 System.out.println("home page is not displayed");
	 
	 driver.findElement(By.xpath("//a[text()='Leads' and contains (@href,'action=index')]")).click();
	 
	 if(driver.getTitle().contains("Leads"))
	 System.out.println("leads page is displayed");
	 else 
	System.out.println("leads page is not displayed");
	 
	String commonPath="";

}
}