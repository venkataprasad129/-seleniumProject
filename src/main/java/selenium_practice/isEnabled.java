package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement loginButton = driver.findElement(By.xpath("//button[.='Log in']"));
		if (loginButton.isEnabled())
			System.out.println("loginbutton is enabled");

		else
			System.out.println("login button disabled");
		
		driver.findElement(By.name("username")).sendKeys("1233455543");
		driver.findElement(By.name("password")).sendKeys("455674567");
		
		if (loginButton.isEnabled()) {
			System.out.println("enabled");
			loginButton.click();
		}
		else
			System.out.println("disabled");
		driver.quit();
}
	}

