package chapter_2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown= driver.findElement(By.id("cars"));
		Select s= new Select(dropdown);
		

		s.deselectByIndex(3);
		Thread.sleep(2000);
		s.deselectByValue("299");
		Thread.sleep(2000);
		s.deselectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		Thread.sleep(2000);
		s.deselectAll();
		

	}

}
