package org.junit.testing;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.sample.BaseClass12;

public class SampleProject07 extends BaseClass12{
	@BeforeClass
	public static void launchBrowser01() {
		System.out.println("Browser Lauching.......");
		launchBrowser();
		WindowMaximize();
	}
	@Before
	public  void startDate() {
		System.out.println("Testcase Start Date and Time:");
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		LaunchUrl("https://mail.google.com/");
	}
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
		LaunchUrl("https://www.facebook.com/");
	}
	@After
	public  void endTime() {
		System.out.println("Time of Test case End:");
		Date d=new Date();
		System.out.println(d);
	}
	@AfterClass
	public static void closeTheBrowser() {
		System.out.println("Close the Browser");
		CloseEntireBrowser();
	}
	@Test
	public void tc3() {
		System.out.println("Test Case 4");
		LaunchUrl("https://inmakes.com/");
	}
	@Test
	public void tc4() {
		System.out.println("Test Case 2");
		LaunchUrl("https://www.youtube.com/");
	}
	@Ignore
	@Test
	public void tc5() {
		System.out.println("Test Case 5");
	}
	
	
	
	
	

}
