package crossBrowserparallelExecution;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class googleTest extends BaseClass 
{
	@Test
	public void googletest()
	{
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement googleImage= driver.findElement(By.xpath("//img[alt='Google']"));
				if (googleImage.isDisplayed())
					System.out.println("google page displayed");
				else
					System.out.println("google page not found");
	}
	


}
