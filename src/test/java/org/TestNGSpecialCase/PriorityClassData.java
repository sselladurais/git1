package org.TestNGSpecialCase;

import org.testng.annotations.Test;

public class PriorityClassData {
	
	
	@Test(priority =-56,invocationCount = 3,enabled=false)
	public void tc_2()
	{
		System.out.println("ClassB Tc_2 priority =-56");
	}
	
	@Test(priority =77)
	public void tc_1()
	{
		System.out.println("ClassB Tc_1 priority =77");
	}
	
	@Test()
	public void tc_3()
	{
		System.out.println("ClassB Tc_3 ");
	}
	
	@Test(priority = 22)
	public void tc_4()
	{
		System.out.println("ClassB Tc_4 priority =22");
	}
	

	
}
