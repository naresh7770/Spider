package Section3;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNG01 {

	@Test(priority = 1)
	public void m1()
	{
		System.out.println("Hi how are you?");
	}
	@Test(priority = 0)
	public void m2()
	{
		System.out.println("I am fine thankyou!");
	}
}
