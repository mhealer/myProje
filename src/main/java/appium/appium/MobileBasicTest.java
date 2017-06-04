package appium.appium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class MobileBasicTest {

	MobileWebDriver webDriver;
	AndroidDriver<WebElement> driver;
	

	@Before
	public void setup() throws Exception {
		webDriver = new MobileWebDriver();
		webDriver.init("ContactManager.apk", "Nexus5", "127.0.0.1:4723");
		
		
		
	}
}