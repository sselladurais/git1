package org.TestNGSpecialCase;

import static org.testng.Assert.assertTrue;

import org.globallib.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HardAssertClass extends BaseClass{
	
	@Test
	public void fbPage()
	{
		browserLaunch();
		enterApplnUrl("https://www.facebook.com/login/");
		WebElement username = findElementBycssselector("input#email");
		sendKeys(username, "Bharath J");
		WebElement password = findelementByXpath("//input[@type='password']");
		sendKeys(password, "bharath29j");
		WebElement submit = findelementByXpath("//button[@name='login']");
		clickButton(submit);
		
	}
	@Parameters("browser")
	@Test
	public void istagramPage(String browsername)
	{
		if(browsername.equals("Edge"))
		{
		WebDriver driver=new EdgeDriver();
		maximizeWindow();
		enterApplnUrl("https://www.instagram.com/accounts/login/?hl=ens");
		implictWait();
		Assert.assertTrue(true);
		}
	}

}
