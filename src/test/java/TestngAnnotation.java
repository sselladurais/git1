import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotation {
	
	@BeforeSuite
	private void tc_1()
	{
		System.out.println("classAtc_1@BeforeSuite");
	}
	
	@BeforeTest
	private void tc_2()
	{
		System.out.println("classAtc_2@BeforeTest");
	}
	
	@AfterSuite
	private void tc_3()
	{
		System.out.println("classAtc_3@AfterSuite");
	}
	@BeforeMethod
	private void tc_4()
	{
		System.out.println("classAtc_4@BeforeMethod");
	}
	@Test
	private void tc_5()
	{
		System.out.println("classAtc_5@BeforeTest");
	}
	@BeforeClass
	private void tc_6()
	{
		System.out.println("classAtc_6@Beforeclass");
	}
	@AfterClass
	private void tc_7()
	{
		System.out.println("classAtc_7@AfterClass");
	}
	@AfterMethod
	private void tc_8()
	{
		System.out.println("classAtc_5@Aftermethod");
	}
	@AfterTest
	private void tc_9()
	{
		System.out.println("classAtc_9@AfterTest");
	}
	

}
