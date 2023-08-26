package vtigerfinalScripts;

public class DeleteLeadTest
{
	@Test
	public void deleteleadTest()
	{
		SoftAssert soft=new SoftAssert();
		
		home.clickleads();
		soft.assertTrue(driver.getTitle().contains("Leads"));
		Map<String,String> map=excel.readFromExcel("Lead", "Delete lead");
		lead.traverseToRequiredLead(web, map.get("Lead Name"));
		lead.clickDelete();
		
		web.handleAlert("ok");
		List<WebElement> leadNameList=lead.getLeadNamesList();
		boolean status=false;
		for(WebElement leads:leadNameList)
		{
			if(!(leads.getText().equals("LEA1")))
			{
				status=true;
			}
		}
	
		soft.assertTrue(status);
		if(status)
			excel.writeToExcel("Lead", "Delete Lead", "Pass", IConstantPath.EXCEL_PATH);
		else
			excel.writeToExcel("Lead", "Delete lead", "Fail", IConstantPath.EXCEL_PATH);
		
		
		soft.assertAll();
	}

}
