package com.test.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hello_New {

	@Test
	public void LogOuttoApplication(){
				System.out.println("Abhishek verma in New hello");
			                  }

	@Test
	public void testmethod20 (){
		
		String actual = "Selenium";
		String expected = "Selenium";
		Assert.assertEquals(actual, expected);
		System.out.println("Actual and Expected matched .. .in New hello ");
			                   }
	
	@Test
	public void testmethod21 (){
		String actual = "QTP";
		String expected = "QTP";
		Assert.assertEquals(actual, expected);
		System.out.println("Actual and Expected not matched in New hello");

                               }
	@Test
	public void testmethod22 (){
				System.out.println("Hello world 44 in New hello");
			                  }
	@Test
	public void testmethod23 (){
				System.out.println("Hello world 23 in New hello");
			                  }
	@Test
	public void testmethod24 (){
				System.out.println("Hello world 24 in New hello");
                           	}
	

}


