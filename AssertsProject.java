package org.junit.testing;

import org.junit.Assert;
import org.junit.Test;
import org.sample.PojoProject;

public class AssertsProject extends BaseClass12{
	@Test
 public void tc1() {
		System.out.println("Test Case 1");
		LaunchUrl("https://www.flipkart.com/");
		PojoProject pp=new PojoProject();
	    String title = PageTitle();
	    String url = PageUrl();
	    PassText("6379937175", pp.getPhoneno());
	    Assert.assertTrue("Check your Page Title", title.contains("Flipkart"));
}
	@Test
	 public void tc2() {
		System.out.println("Test Case 2");
		
	}
	@Test
	 public void tc3() {
		System.out.println("Test Case 3");
		
	}
	
	

}
