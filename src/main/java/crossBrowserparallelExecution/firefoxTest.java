package crossBrowserparallelExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class firefoxTest extends BaseClass 
	{
		@Test
		public void firefoxTest()
		{
			driver.get("https://www.swiggy.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement googleImage= driver.findElement(By.xpath("//*[name()='svg']"));
					if (googleImage.isDisplayed())
						System.out.println("swiggy page displayed");
					else
						System.out.println("swiggy page not found");
		}

}
