package com.adaa.mobile.test;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class ScrollTest extends BasicTest {
	
	public ScrollTest() {
		super();
	}

	@Test
	public void scenario1() {
		//get child by text
		MobileElement element = getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/tab_recycler_view\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.TextView\"),\"Nuevas aplicaciones\")"));
		
	}
	
	@Test
	public void scenario2() {
		//get child by descriptios, content desc, with a diferent container
				MobileElement element = getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/list_tab_wrapper\")).getChildByDescription("
						+ "new UiSelector().className(\"android.widget.ImageView\"),\"Opciones\")"));
	}
	
	@Test
	public void scenario3() {
		//with scroll into view, this can be used with content-desc or text
		MobileElement element = getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/list_tab_wrapper\")).scrollIntoView("
				+ "new UiSelector().text(\"Para varios jugadores\"))"));
	}
	

	@Test
	public void scenario4() {
		//using instance method
		MobileElement element = getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/list_tab_wrapper\")).scrollIntoView("
				+ "new UiSelector().textMatches(\"VER MÁS\").instance(2))"));
	}
}
