package chapter_2_selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_properties {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu")).click();
		
		driver.findElement(By.xpath("//div[text()=SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)']")).click();
		String parentId = driver.getWindowHandle();
		Set<String> allWindows =driver.getWindowHandles();
		
		for (String s :allWindows) 
		{
			driver.switchTo().window(s);
			
		}
driver.findElement(By.xpath("//[text()='Add to cart']")).click();
driver.switchTo().window(parentId);
driver.navigate().refresh();

WebElement cartIcon= driver.findElement(By.xpath("//div[@class='KK-o3G']"));

if (cartIcon.getText().equals("1"))
	System.out.println("added to cart");
else
	System.out.println("failed");
 driver.quit();

	}

}
