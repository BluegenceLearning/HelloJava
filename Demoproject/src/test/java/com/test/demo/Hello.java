package com.test.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hello {

	@Test
	public void LogintoApplication(){
				System.out.println("Abhishek verma");
			                  }

	@Test
	public void testmethod2 (){
		
		String actual = "Selenium";
		String expected = "Selenium";
		Assert.assertEquals(actual, expected);
		System.out.println("Actual and Expected matched .. .rrr ");
			                   }
	
	@Test
	public void testmethod3 (){
		String actual = "QTP";
		String expected = "QTP";
		Assert.assertEquals(actual, expected);
		System.out.println("Actual and Expected not matched");

                               }
	@Test
	public void testmethod4 (){
				System.out.println("Hello world 4");
			                  }
	@Test
	public void testmethod5 (){
				System.out.println("Hello world 5");
			                  }
	@Test
	public void testmethod6 (){
				System.out.println("Hello world 6");
                           	}
	
	@Test
	public void testmethod7 (){
				System.out.println("Hello world 90909");
			                  }
	
	@Test
	public void testmethod8 (){
				System.out.println("Method 8");
			                  }
	@Test
	public void testmethod9 (){
				System.out.println("Method 9");
			                  }
	
}


