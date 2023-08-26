package groupexecution;

import org.testng.annotations.Test;

public class test4 {
	@Test
	public void demo1()
	{
		System.out.println("Test4 - demo1");
	}
	@Test(groups={"regression","smoke","functional","system"})
	public void demo2()
	{
		System.out.println("Test4 - demo2 - regression and smoke and functional and system");
	}
	@Test(groups={"regression","smoke","functional","system"})
	public void demo3()
	{
		System.out.println("Test4 - demo3 - regression and functional and system");
	}
}
