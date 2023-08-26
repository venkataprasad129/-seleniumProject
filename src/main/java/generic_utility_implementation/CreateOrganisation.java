package generic_utility_implementation;

import Generic_libraries.Excel_Utility;
import Generic_libraries.IConstant_Path;
import Generic_libraries.JavaUtilityy;
import Generic_libraries.Properties_utility;
import Generic_libraries.webDriver_utility;

public class CreateOrganisation {

	public static void main(String[] args) {
		Properties_utility  property=new Properties_utility ();
		Excel_Utility  excel=new Excel_Utility();
		JavaUtilityy jutil=new JavaUtilityy();
		webDriver_utility wdutil=new webDriver_utility();
		property.propretiesInitialization(IConstant_Path.PROPERTIES_PATH)
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		if(driver.getTitle().contains("vtiger"))
			System.out.println("Login page is displayed");
		else
			System.out.println("login page is not displayed");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		driver.findElement(By.id("submitButton")).submit();
		
		if(driver.getTitle().contains("Home"))
			System.out.println("Home page is displayed");
		else
			System.out.println("Home page is not found");
		
		driver.findElement(By.xpath("//a[text()='Organizations' and \"action=index\"]")).click();
		
		if(driver.getTitle().contains("Organisations"))
			System.out.println("Oragnisations page is displayed");
		else
			System.out.println("Organisations is not found");
		
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		WebElement creatorg=driver.findElement(By.xpath("//span[@class='lvtHeaderText']"));
		if(creatorg.equals("Creating New Organisation"))
			System.out.println("Create New Oragnisation page is displayed");
		else
			System.out.println("Creating New Organisation is not found");
		
		
		Random random=new Random();
		int randomNum=random.nextInt(100);
		
		String orgName="TCS"+randomNum;
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[normalize-space(@value)='Save']")).click();
		
		String newOrgInfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		
		if(newOrgInfo.contains(orgName))
			System.out.println("Organisation created successfully");
		else
			System.out.println("Organisation not created");
		
		WebElement adminIcon=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(adminIcon).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		driver.quit();


	}

}
