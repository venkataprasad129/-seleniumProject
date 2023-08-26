package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitly_wait_fb {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("9515172192");
		driver.findElement(By.name("pass")).sendKeys("venkat@7716");
		driver.findElement(By.id("//button[text()='Log in']")).click();
		
WebElement title=driver.findElement(By.xpath("//span[text()='Feeling/activity']"));
if (title.isDisplayed())
	System.out.println("home page is displayed");
else
	System.out.println("home page is not displayed");
driver.close();

	}

}
