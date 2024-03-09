import javax.security.auth.Refreshable;

import org.globallib.BaseClass;
import org.testng.annotations.Test;

public class RepeatUserName extends BaseClass{
	
	public void getUserData() throws InterruptedException
	{
		browserLaunch();
		enterApplnUrl("https://www.facebook.com/");
		maximizeWindow();
		implictWait();
		LoginPage login=new LoginPage();
        login.getData();
		
	}

	
	public static void main(String[] args) throws InterruptedException {
		RepeatUserName user=new RepeatUserName();
		user.getUserData();
	}
}
