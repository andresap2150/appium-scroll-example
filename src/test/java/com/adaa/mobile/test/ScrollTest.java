package com.adaa.mobile.test;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ScrollTest extends BasicTest {
	
	public ScrollTest() {
		super();
	}
	
	private static final Logger log = LogManager.getLogger(ScrollTest.class);

//	@Test
//	public void scenario1() {
//		//get child by text
//		MobileElement element = getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/tab_recycler_view\")).getChildByText("
//				+ "new UiSelector().className(\"android.widget.TextView\"),\"Nuevas aplicaciones\")"));
//		
//	}
//	
//	@Test
//	public void scenario2() {
//		//get child by descriptios, content desc, with a diferent container
//				MobileElement element = getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/list_tab_wrapper\")).getChildByDescription("
//						+ "new UiSelector().className(\"android.widget.ImageView\"),\"Opciones\")"));
//	}
//	
//	@Test
//	public void scenario3() {
//		//with scroll into view, this can be used with content-desc or text
//		MobileElement element = getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/list_tab_wrapper\")).scrollIntoView("
//				+ "new UiSelector().text(\"Para varios jugadores\"))"));
//	}
//	
//
//	@Test
//	public void scenario4() {
//		//using instance method, some times this did't work
//		MobileElement element = getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/list_tab_wrapper\")).scrollIntoView("
//				+ "new UiSelector().textMatches(\"VER MÁS\").instance(4))"));
//	}
//	
//	@Test
//	public void scenario5() {
//		//setting the max searhc swipes
//		MobileElement element = getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/list_tab_wrapper\")).setMaxSearchSwipes(4).scrollIntoView("
//				+ "new UiSelector().textMatches(\"VER MÁS\").instance(5))"));
//	}
//	
//	@Test
//	public void scenario6() {
//		//settin a horizontal list
//		MobileElement element = getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/subnav_container\")).setAsHorizontalList().scrollIntoView("
//				+ "new UiSelector().descriptionContains(\"Acceso anticipado\"))"));
//	}
	
	@Test
	public void scenario7() {
		//the press method only acepts a point option
		TouchAction actions = new TouchAction(getDriver());
		MobileElement workapps = getDriver().findElement(MobileBy.xpath("//android.widget.TextView[@text = 'Apps de trabajo']"));
		MobileElement top = getDriver().findElement(MobileBy.xpath("//android.widget.TextView[@text = 'Para ti']"));
		int startx = workapps.getLocation().getX();
		int starty = workapps.getLocation().getY();
		PointOption startingPoint = PointOption.point(startx, starty);
		WaitOptions waitOptions = WaitOptions.waitOptions(Duration.ofSeconds(5));
		int endx = top.getLocation().getX();
		int endy = top.getLocation().getY();
		log.info(String.format("Actual starting x:%s, y:%s. Final ending x:%s, y:%s.", startx, starty,endx,endy));
		PointOption endPoint = PointOption.point(endx, endy);
		//actions.press(startingPoint).waitAction(waitOptions).moveTo(endPoint).release().perform();
		actions.press(startingPoint).moveTo(endPoint).release().perform();
		MobileElement finalEditor = getDriver().findElement(MobileBy.xpath("//android.widget.TextView[@text = 'Apps de trabajo']"));
		log.info(String.format("Actual final point x:%s, y:%s.", finalEditor.getLocation().getX(),finalEditor.getLocation().getY()));
		MobileElement earlyAcces = getDriver().findElement(MobileBy.xpath("//android.widget.TextView[@text = 'Selección del editor']"));
	}
}
