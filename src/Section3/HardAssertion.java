package Section3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	public void m1()
	{
		Reporter.log("method starts",true);
		String actdata="Naresh";
		String expdata="naresh";
		Assert.assertEquals(actdata,expdata);
		Reporter.log("method ends",true);
		
	}
	
}
