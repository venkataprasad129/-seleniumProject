package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomPages.LoginPage;

public class vtiger_loginTest {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		LoginPage login =new LoginPage(driver);
		login.loginToApp("admin","venkat");
		
		if (driver.getTitle().contains("vtiger"))
			System.out.println("Login passed");
		else
			System.out.println("Login failed");
		
		driver.quit();
		
	}

}
