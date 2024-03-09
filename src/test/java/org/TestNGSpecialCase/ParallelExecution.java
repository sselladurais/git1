package org.TestNGSpecialCase;

import org.globallib.BaseClass;

import org.testng.annotations.Test;

public class ParallelExecution extends BaseClass{
	
	@Test
	public void fbLogin()
	{
		browserLaunch();
		maximizeWindow();
		enterApplnUrl("https://www.facebook.com/");
	}

	@Test
	public void instagarmLogin()
	{
		browserLaunch();
		maximizeWindow();
		enterApplnUrl("https://www.instagram.com/accounts/login/");
	}
	
	
	@Test
	public void theardLogin()
	{
		browserLaunch();
		maximizeWindow();
		enterApplnUrl("https://www.threads.net/login");
	}
	
	
}
