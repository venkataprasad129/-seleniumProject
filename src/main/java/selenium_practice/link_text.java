package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_text {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.linkText("Forgotten password?"));
		driver.findElement(By.linkText("Create a Page")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
