package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement logo = driver.findElement(By.xpath("//*[name()='svg'][@id='Layer_1']"));
	if (logo.isDisplayed())
		System.out.println("logo is displayed");

	else
		System.out.println("logo not disabled");
	driver.quit();

	}

}
