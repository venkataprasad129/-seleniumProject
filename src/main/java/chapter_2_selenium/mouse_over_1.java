package chapter_2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over_1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement kids =driver.findElement(By.xpath("//a[text()='Kids' and  @class='desktop-main']"));
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Learning & Development']"));
		String pageTitle = driver.findElement(By.xpath("//div[@class='filter-summery-filter']")).getText();
		
		if(pageTitle.equals("Learning and Development Toys"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.quit();
		

	}

}
