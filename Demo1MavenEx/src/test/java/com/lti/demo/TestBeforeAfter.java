package com.lti.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.lti.Calculator;

public class TestBeforeAfter {
	@BeforeAll
  public static void testdbConn() {
	  System.out.println("db conn is up");
  }
	
	
	@Test
	public void testAddition()
	{
	System.out.println("test add method ");
	Calculator c= new Calculator();
	int result= c.addNos(100, 300);
	Assertions.assertEquals(400, result);
	}
	@Test
	public void testSub()
	{
	System.out.println("test sub method ");
	Calculator c= new Calculator();
	int result= c.subNos(100, 50) ;
	Assertions.assertEquals(50, result);
	}

}