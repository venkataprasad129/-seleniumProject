package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class partial_linktext {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		Thread .sleep(2000);
		driver.findElement(By.partialLinkText("Return to login page")).click();
		Thread .sleep(2000);
	}
	

}
