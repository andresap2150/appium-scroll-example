package com.adaa.mobile.test;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import com.adaa.mobile.appium.SimpliestMobileFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasicTest {
	
	private static final Logger log = LogManager.getLogger(BasicTest.class);
	
	private AppiumDriver<MobileElement> driver;
	private FluentWait<AppiumDriver<MobileElement>> wait;
	
	
	public BasicTest() {		

		driver = new SimpliestMobileFactory().getDriver();
		wait = new FluentWait<>(this.driver).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1));
		
		//PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}

	public AppiumDriver<MobileElement> getDriver() {
		return driver;
	}

	public FluentWait<AppiumDriver<MobileElement>> getWait() {
		return wait;
	}

}
