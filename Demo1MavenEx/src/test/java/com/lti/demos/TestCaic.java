package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.lti.demos.Calculator;

class TestCaic {
    
	
	Calculator c=new Calculator();
	
	@Test
 public void testHello()
 {
	 Assertions.assertEquals("Hello World", c.sayHello());
 }
	@Disabled
	@Test
	public void testAddition()
	{
		Assertions.assertEquals(500, c.addNos(300, 200));
	}
	@Test
  public void testSubtract() {
	  Assertions.assertEquals(100, c.subNos(200, 100));
	  
	 @Test 
	   void testFalse()
		{
			Assertions.assertFalse(500, c.addNos(300, 200));
			Assertions.assertFalse()
		}
	  
  }
}
