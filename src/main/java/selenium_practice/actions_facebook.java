package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actions_facebook {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("//html")).sendKeys(Keys.F5);
	//	driver.findElement(By.linkText("Forgotten account?")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Thread.sleep(3000);
		driver.quit();
	}

}
