package com.ibm.bluemix.test;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ibm.bluemix.BankUiController;

public class UserNamecheck {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void UserNamecheck() {
		//fail("Not yet implemented");
		BankUiController bui=new BankUiController();
		System.out.println("UserNamecheck Completed Successfully");
		
	}

}