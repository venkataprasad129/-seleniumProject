package chapter_2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_calender_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.id("26/07/2023")).click();
		
		 Thread.sleep(2000);
		 System.out.println("successful");
		  driver.quit();
	}

}
