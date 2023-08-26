package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Chapter_03.WebDriver_Utility;
import Generic_libraries.webDriver_utility;

public class home_page 
{
	//Deleclaration
	@FindBy(xpath ="//a[text()='Leads'and contains(@href,'action=index')]")
    private WebElement leadsTab;
	@FindBy(xpath ="//a[text()='Organisation'and contains(@href,'action=index')]")
	private WebElement organisationTab;
	@FindBy(xpath ="//a[text()='Contacts'and contains(@href,'action=index')]")
	private WebElement contactsTab;
	@FindBy(id="qccombo")
	private WebElement quickCreateDropdown;
	@FindBy(xpath="//img[@src='themes/softed/images/user,PNG']")
	private WebElement adminIcon;
	@FindBy(xpath="//a[text()='Sign out']")
	private WebElement signoutButton;
	
	
	public home_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickLeads()
	{
		leadsTab.click();
	}
	public void clickOrganisation()
	{
		leadsTab.click();
	}
		public void clickContacts()
		{
			leadsTab.click();

        }
		public void selectFromQuickCreate(WebDriver_Utility web,String value)
		{
			web.selectFromDropdown(quickCreateDropdown, value);
		}
		public void signoutOfVtiger(webDriver_utility web)
		{
			web.mouseHover(adminIcon);
			signoutButton.click();
		}
}
