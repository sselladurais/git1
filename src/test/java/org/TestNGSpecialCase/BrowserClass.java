package org.TestNGSpecialCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserClass {
	
	public WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void browserTypes(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else if(browserName.equals("Edge"))
		{
			 driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("arun");
		
	}

}
