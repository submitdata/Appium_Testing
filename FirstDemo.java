package com.mobile.MyFirstTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class FirstDemo 
{
	@Test
	public void test() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options options = new UiAutomator2Options();
		//options.setDeviceName("rocky");
		options.setDeviceName("rocky");
		options.setApp("C:\\Users\\LearnVern\\Desktop\\p\\MyFirstTest\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(10000);
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
