package selenium_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class limiting_WebDriver_scope_1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	WebElement footer =driver.findElement(By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']"));
	List<WebElement>footerLinks = footer.findElements(By.tagName("a"));
	for (WebElement Link : footerLinks) {
		System.out.println(Link.getText());
		
	}
	driver.quit();


	}

}
