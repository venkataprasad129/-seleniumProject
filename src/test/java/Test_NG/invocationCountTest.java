package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCountTest 
{
	@Test(invocationCount =1 )
	public void demo1()
	{
	Reporter.log("demo1",true);	
	}
	@Test(invocationCount =2 )
	public void demo2()
	{
	Reporter.log("demo2",true);	
	}
	@Test
	public void demo3()
	{
	Reporter.log("demo3",true);	
	}
	@Test(invocationCount =-1 )
	public void demo4()
	{
	Reporter.log("demo4",true);	
	}
	@Test(invocationCount =-2 )
	public void demo5()
	{
	Reporter.log("demo5",true);	
	}
	@Test(invocationCount =-3 )
	public void demo6()
	{
	Reporter.log("demo6",true);	
	}

}
