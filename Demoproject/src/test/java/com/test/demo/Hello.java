package com.test.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hello {

	@Test
	public void testmethod1 (){
				System.out.println("Hello world 1");
			                  }

	@Test
	public void testmethod2 (){
		
		String actual = "Selenium";
		String expected = "Selenium";
		Assert.assertEquals(actual, expected);
		System.out.println("Actual and Expected matched");
			                   }
	
	@Test
	public void testmethod3 (){
		String actual = "Selenium";
		String expected = "QTP";
		Assert.assertEquals(actual, expected);
		System.out.println("Actual and Expected not matched");

                               }
	
}
