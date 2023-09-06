package Section3;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void m1()
	{
		Reporter.log("main start",true);
		String actdata="Naresh";
		String expdata="Naresh";
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actdata,expdata);
		Reporter.log("main ends",true);
		sf.assertAll();
				
	}
	
	
	
	
	
}
