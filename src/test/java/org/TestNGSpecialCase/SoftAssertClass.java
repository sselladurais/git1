package org.TestNGSpecialCase;

import org.globallib.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass extends BaseClass{
	
	
	@Test
	public void fbPage()
	{
		browserLaunch();
		enterApplnUrl("https://www.facebook.com/login/");
		maximizeWindow();
		WebElement username = findElementBycssselector("input#email");
		sendKeys(username, "bj29112002@gmail.com");
		WebElement password = findelementByXpath("//input[@type='password']");
		sendKeys(password, "bharath29j");
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(false);
		WebElement submit = findelementByXpath("//button[@name='login']");
		clickButton(submit);
		
	}

}
