package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion
{
	@Test
	public void demo () 
	{
		String s1="Hello";
		String s2="hello";
		
		SoftAssert soft = new SoftAssert();
		
		Assert.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		
		soft.assertAll();
	}
}
