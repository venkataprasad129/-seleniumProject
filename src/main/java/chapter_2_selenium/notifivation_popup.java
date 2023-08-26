package chapter_2_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notifivation_popup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		System.out.println("notifications disabled");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
