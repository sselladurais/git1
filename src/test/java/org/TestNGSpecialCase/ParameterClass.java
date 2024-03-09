package org.TestNGSpecialCase;

import org.globallib.BaseClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClass extends BaseClass{
	
	@Parameters({"user110","user123"})
	@Test
	public void fbLogin(@Optional("admin")String username,String password)
	{
		browserLaunch();
		enterApplnUrl("https://www.facebook.com/");
		maximizeWindow();
		findElementById("email").sendKeys(username);
		findElementById("pass").sendKeys(password);
	}

}
