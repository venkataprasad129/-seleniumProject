package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLeadsInfoPage
{
	// Declaration 
		@FindBy (xpath="//span[@class=' dvHeaderText']")
		private WebElement pageHeader; 
		@FindBy (name = "Duplicate")
		private WebElement duplicateButton;

 // Initialization
		public void NewLeadInfoPage (WebDriver driver)
		{
			PageFactory.initElements (driver, this);
		}

 // Utilization
		public String getPageHeader() {
			return pageHeader.getText();
		}

		public void clickDuplicateButton() {
		duplicateButton.click();
		}
	}


