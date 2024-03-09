import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.globallib.BaseClass;
import org.testng.annotations.Test;

public class RedBusDate extends BaseClass{
	
	@Test
	public void dateBtn() throws AWTException, InterruptedException
	{
		browserLaunch();
		enterApplnUrl("https://www.redbus.in/");
		maximizeWindow();
		implictWait();
		String month="Mar 2024";
		String day="20";
		findElementBycssselector("input#src").sendKeys("Chn");
		findelementByXpath("(//text[text()='CMBT, Chennai'])[2]").click();
		findElementBycssselector("input#dest").sendKeys("bng"); 
		findelementByXpath("//text[text()='Marathahalli']").click();
		//Robot robot=new Robot();
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);
		sleep();
		findelementByXpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']").click();
		//*while(true) {
		//String text = findelementByXpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]").getText();
		//System.out.println(text);
		//if(text.equals(month))
		//{
		//	break;
		//}
		//else
		//{
		//findelementByXpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']").click();
		//}
		//}
		//findelementByXpath("//text[text()='20 Mar']").click();//
	}

}
