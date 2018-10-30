package com.adaa.mobile.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SimpliestMobileFactory {
	
	private static final Logger log = LogManager.getLogger(SimpliestMobileFactory.class);
	
	public AppiumDriver<MobileElement> getDriver() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "HUAWEI NXT-L09");
		caps.setCapability("udid", "AXS0216313001333"); 
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "com.disney.wdw.android");
		caps.setCapability("appActivity", "com.disney.wdpro.park.activities.LoaderActivity");
//		caps.setCapability("appPackage", "com.android.vending");
//		caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("noReset", true);
		
		URL remoteAddress = null;
		try {
			remoteAddress = new URL("http://0.0.0.0:4723/wd/hub");
		} catch (MalformedURLException e) {
			log.error(e.getMessage());
		}
		return new AndroidDriver<MobileElement>(remoteAddress,caps);
	}

}