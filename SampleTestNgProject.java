package org.tet;

import java.util.Date;

import org.sample.BaseClass12;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNgProject extends BaseClass12{
	@Test(priority=7)
	public void tc7() {
		System.out.println("Test Case 7");
		LaunchUrl("https://www.youtube.com/");
	}

	@Test
	public void tc2() {
		System.out.println("Test Case 2");
		LaunchUrl("https://inmakes.com/");
	}

	@Test(priority=-15)
	public void tc4() {
		System.out.println("Test Case 4");
		LaunchUrl("https://www.flipkart.com/");
	}
	@Test(priority=-2)
	public void tc6() {
		System.out.println("Test Case 6");
		LaunchUrl("https://www.facebook.com/");
	}
	@Test(priority = 24)
	public void tc3() {
		System.out.println("Test Case 3");
		LaunchUrl("https://www.redbus.in/");
	}
	@Test(priority= -2)
	public void tc1() {
		System.out.println("Test Case 1");
		LaunchUrl("https://mail.google.com/");
	}
	@Test(priority=4)
	public void tc5() {
		System.out.println("Test Case 5");
		LaunchUrl("https://www.amazon.in/");
	}
	

	@BeforeMethod
	public void startDate() {
		System.out.println("Test Case Starting Date & Time:");
		Date d = new Date();
		System.out.println(d);

	}

	@AfterMethod
	public void endDate() {
		System.out.println("Test Case Ending Date & time..");
		Date d = new Date();
		System.out.println(d);
	}

	@BeforeClass
	public void launchTheBrowser() {
		System.out.println("Launch the Browser....");
		launchBrowser();
		WindowMaximize();
	}

	@AfterClass
	public void closeTheBrowser() {
		System.out.println("Close the Browser");
	}
}
