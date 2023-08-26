package chapter_2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop_1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement Block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
			Thread.sleep(2000);
		Actions a = new Actions (driver);
		a.dragAndDrop(Block1,Block4).perform();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
