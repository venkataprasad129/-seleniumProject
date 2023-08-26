package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class practiceTest
{
	@Test
	public void googleTest() throws MalformedURLException, InterruptedException 
	{
	URL url = new URL("http://192.168.174.121:9999/wd/hub");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	RemoteWebDriver driver = new RemoteWebDriver(url, cap);
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	Thread.sleep(3000);
	driver.close();

}
}
