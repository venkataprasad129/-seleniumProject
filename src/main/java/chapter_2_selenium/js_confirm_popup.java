package chapter_2_selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_confirm_popup {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.quit();
		
	}

}
