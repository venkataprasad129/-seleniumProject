package Listeners;

import org.testng.annotations.Test;

public class TestClass extends BaseClass
{
	@Test
	public void testMethod1()
	{
		System.out.println("Test1");
	}
	@Test(dependsOnMethods = "testMethod1")
	public void testMethod2()
	{
		System.out.println("Test2");
	}

}
