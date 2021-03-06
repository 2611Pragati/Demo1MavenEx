package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.Calculator;

class TestCalc {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	Calculator c=new Calculator();
	@Test
	public void  testHello()
	{
		//Assertions.assertEquals(expcted, actual);//
		Assertions.assertEquals("Hello World",c.sayHello());
	}
	@Test
	public void testAddition() {
		Assertions.assertEquals(500,c.addNos(300,200));
	}
	
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	@Test
	public void testEmptyArrayList() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Assertions.assertEquals(0, al.size());
	Assertions.assertTrue(al.isEmpty()); // assertTrue Method
	al.add(100);
	al.add(200);
	Assertions.assertEquals(0, al.size());
	// assertFalse(al.isEmpty());
	}



}
