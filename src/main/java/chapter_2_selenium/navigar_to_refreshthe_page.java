package chapter_2_selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigar_to_refreshthe_page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.location=arguments[0]","https://www.ebay.com/");
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));
		
		Thread.sleep(2000);
		 js.executeScript("history.go(0)");
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
