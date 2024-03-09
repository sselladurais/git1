package org.TestNGSpecialCase;

import java.io.IOException;

import org.globallib.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass extends BaseClass{
	
	@Test(dataProvider ="data" )
	public void fbLogin(String username,String password)
	{
		browserLaunch();
		enterApplnUrl("https://www.facebook.com/");
		maximizeWindow();
		findElementById("email").sendKeys(username);
		findElementById("pass").sendKeys(password);
	}
	
	@DataProvider(name="data",indices= {1,2})
	public Object[][] dataPro() throws IOException
	{
		Object[][] a=new Object[3][2];
		a[0][0]=getCellData("data", 1, 0);
		a[0][1]=getCellData("data", 1, 1);
		
		a[1][0]=getCellData("data", 2, 0);
		a[1][1]=getCellData("data", 2, 1);
		
		a[2][0]=getCellData("data", 3, 0);
		a[2][1]=getCellData("data", 3, 1);
		return a;
	}
	
	

}
