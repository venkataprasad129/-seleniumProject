package Listeners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	@BeforeSuite
	public void suiteSetup()
	{
		System.out.println("Beforesuite");
	}
	@BeforeTest
	public void testeSetup()
	{
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void classSetup()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void methodSetup()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void MethodTeardown()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void ClassTeardown()
	{
		System.out.println("AfterClass");
	}
	@AfterTest
	public void TestTeardown()
	{
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void SuiteTeardown()
	{
		System.out.println("AfterSuite");
	}
}
