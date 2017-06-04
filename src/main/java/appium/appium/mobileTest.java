package appium.appium;

import org.junit.Before;
import org.junit.Test;

public class mobileTest extends MobileBasicTest {

//	MobileWebDriver driver;

	private final static String idPrefix = "com.example.android.contactmanager:id/";


	

	@Test
	public void caleq14() throws Exception {

		// driver.setConnection(Connection.WIFI);

		// driver.setLocation(34.55, 27.44, 300);
		webDriver.startApp("com.android.calculator2.Calculator", "com.android.calculator2");

		webDriver.findElementByText("7").click();
		webDriver.findElementByText("+").click();
		webDriver.findElementByText("7").click();
		webDriver.findElementByText("=").click();
		//driver.startApp("com.mantishrimp.salienteye", "mantishrimp.salienteye.ui.NewMainActivity");
//		driver.takeScreenshot();

	}

}
