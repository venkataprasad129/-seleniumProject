package Generic_libraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomPages.CreateNewContactPage;
import PomPages.CreateNewLeadPage;
import PomPages.CreateNewOrganizationPage;
import PomPages.DuplicatingLeadPage;
import PomPages.LoginPage;
import PomPages.NewContactInfoPage;
import PomPages.NewLeadsInfoPage;
import PomPages.NewOrgInfoPage;
import PomPages.home_page;

public class BaseClass
{
	protected Properties_utility property;
	protected Excel_Utility excel;
	protected JavaUtilityy jutil;
	protected webDriver_utility web;
	protected WebDriver driver;
	
	protected LoginPage login;
	protected home_page home;
	protected CreateNewOrganizationPage org;
	protected CreateNewContactPage contacts;
	protected CreateNewLeadPage lead;
	protected NewOrgInfoPage NewOrginfo;
	protected NewContactInfoPage newContavtinfo;
	protected NewLeadsInfoPage newLeadinfo;
	protected DuplicatingLeadPage duplicatinglead;
	
	public static WebDriver sdriver;
	public static JavaUtilityy sjutil;
	
	@BeforeClass
	public void classSetup()
	{
		property= new Properties_utility();
		excel = new Excel_Utility();
		jutil = new JavaUtilityy();
		web = new webDriver_utility();
		
		property.propertiesInitializaton(IConstant_Path.PROPERTIES_PATH);
		driver= web.launchBrowser(property.readFromProperties("browser"));
		
		web.maximizeBrowser();
		web.waitTillElementFound(Long.parseLong(property.readFromProperties("time")));
		
		sdriver = driver;ne
		sjutil = jutil;
	}
	@BeforeMethod
	public void Methodsetup() 
	{
		login = new LoginPage(driver);
		home = new home_page(driver);
		org = new CreateNewOrganizationPage(driver);
		lead = new CreateNewLeadPage(driver);
		NewOrginfo= new NewOrgInfoPage(driver);
		newContavtinfo = new NewContactInfoPage(driver);
	   // newLeadinfo= new NewLeadsInfoPage(driver);
		createOrg= new Create
		
		
		
		
		
	}

}
