package appium.appium.MobileAppObjects;

import appium.appium.MobileWebDriver;

public class contactManagerApp {

	MobileWebDriver androidDriver;

	public contactManagerApp(MobileWebDriver androidDriver) {
		this.androidDriver = androidDriver;
	}

	public void addContactName(String name){
		androidDriver.findElementById(name);
	}

}
