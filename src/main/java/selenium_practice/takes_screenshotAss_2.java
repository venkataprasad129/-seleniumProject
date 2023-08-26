package selenium_practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takes_screenshotAss_2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		 File src =ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./WindowSS/myntra.png");
		 FileUtils.copyFile(src, dest);
		 driver.close();

	}

}
