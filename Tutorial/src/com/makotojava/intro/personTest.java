package com.makotojava.intro;

import junit.framework.TestCase;
import java.util.logging.Logger;

public class personTest extends TestCase {

	public void testPerson() {
		  Person p = new Person("Joe Q Author", 42, 173, 82, "Brown", "MALE");
		  Logger l = Logger.getLogger(Person.class.getName());
		//  l.info("Name: " + p.getName());
		  l.info("Age:" + p.getAge());
		  l.info("Height (cm):" + p.getHeight());
		  l.info("Weight (kg):" + p.getWeight());
		  l.info("Eye Color:" + p.getEyeColor());
		  l.info("Gender:" + p.getGender());
		  //assertEquals("Joe Q Author", p.getName());
		  assertEquals(42, p.getAge());
		  assertEquals(173, p.getHeight());
		  assertEquals(82, p.getWeight());
		  assertEquals("Brown", p.getEyeColor());
		  assertEquals("MALE", p.getGender());	}

}
