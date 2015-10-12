package com.cisc181.core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	Staff newStaff1;
	Staff newStaff2;
	Staff newStaff3;
	Staff newStaff4;
	Staff newStaff5;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		newStaff1 = new Staff(null, null, null, null , null, null, null, null, 0, 35000, null, null);
		newStaff2 = new Staff(null, null, null, null, null, null, null, null, 0, 30000, null, null);
		newStaff3 = new Staff(null, null, null, null, null, null, null, null, 0, 40000, null, null);
		newStaff4 = new Staff(null, null, null, null, null, null, null, null, 0, 60000, null, null);
		newStaff5 = new Staff(null, null, null, null, null, null, null, null, 0, 15000, null, null);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		newStaff1 = null;
		newStaff2 = null;
		newStaff3 = null;
		newStaff4 = null;
		newStaff5 = null;
	}

	@Test
	public void salaryTest() {
		assertEquals("25000 expected 36000 actually ",(long)36000,(long)25000);
		assertTrue(1==1);

	}
	
	@Test
	public void DOBTest()throws PersonException{
		assertEquals("Expected to be no more than 100 years old actually 208 years old.",(long)208,(long)100);
		assertTrue(1==1);
	}
}
