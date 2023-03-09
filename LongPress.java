package com.mobile.MyFirstTest;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest{

	@Test
	public void LongPressGesture() throws MalformedURLException, InterruptedException
	{

		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	WebElement ele=	driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(ele);
		Thread.sleep(5000);
	String menuText =	driver.findElement(By.id("android:id/title")).getText();
	Assert.assertEquals(menuText, "Sample menu");
	Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
	
			
	}
	
	
}
