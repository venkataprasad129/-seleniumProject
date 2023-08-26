package chapter_2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class psaaData_Addclick_usingJSE {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement seatchTf= driver.findElement(By.id("twotabsearchtextbox"));
		JavascriptExecutor js=(JavascriptExecutor ) driver;
		js.executeScript("arguments[0].value=arguments[1]",seatchTf ,"headphones");
		
		WebElement searchButton= driver.findElement(By.id("nav-search-submit-button"));
		js.executeScript("arguments[0].click()",searchButton);
		 Thread.sleep(2000);
		 driver.quit();
		
		
		
		
		
	}

}
