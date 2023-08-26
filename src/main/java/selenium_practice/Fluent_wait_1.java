package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluent_wait_1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				              .withTimeout(Duration.ofSeconds(20))
				              .pollingEvery(Duration.ofSeconds(20))
				              .ignoring(Exception.class);			              
	WebElement header = wait.until(new Function<WebDriver,WebElement>()
			{
			public WebElement apply(WebDriver driver) {
				WebElement e= driver.findElement(By.xpath("//h4[text()='Hello World!']"));
				if(e.isDisplayed())
					return e;
				else 
					return null;
			}
	});
		System.out.println(header.getText());
		driver.quit();
				              
	}

}
