package com.adaa.mobile.test;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class ScrollTest extends BasicTest {
	
	public ScrollTest() {
		super();
	}

	@Test
	public void Scenario1() {
		MobileElement element = getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/tab_recycler_view\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.TextView\"),\"Los más descargados\")"));
		
	}
}
