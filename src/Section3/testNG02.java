package Section3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG02 {

	@Test
	public void m1()
	{
		Reporter.log("First method ",true);
	}
	@Test(invocationCount = 3)
	public void m2()
	{
		Reporter.log("second method ",true);
	}
}
