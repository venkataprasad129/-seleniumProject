package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_facebook_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("email")).sendKeys("9515172192");
		driver.findElement(By.name("pass")).sendKeys("venkat@7716");
		driver.findElement(By.id("//button[text()='Log in']")).click();
		
		  WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
			try {
			boolean status=	wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
			if(status)
				System.out.println("Home page is displayed");
			}
			catch (Exception e) {
				System.out.println("login failed");
				
			}
driver.close();
	}

}
