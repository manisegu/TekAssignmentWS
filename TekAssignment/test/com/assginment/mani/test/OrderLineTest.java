package com.assginment.mani.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.assginment.mani.Item;
import com.assginment.mani.OrderLine;

public class OrderLineTest {
	
	OrderLine orl;
	Item item;

	

	@Before
	public void setUp() throws Exception {
		orl = new OrderLine(new Item("Quantity test case",12.34f),-2);
	}

	@After
	public void tearDown() throws Exception {
		orl = null;
		item = null;
	}

	@Test
	public void testGetQuantity() {
		int actual = orl.getQuantity();
		int expected = 0;
		assertEquals("Two Values are Equal",expected, actual,0.0f);

	}
	
	
	@Test(expected = NullPointerException.class)
	public void testItemNull() throws Exception {
		Item i = null;
		orl = new OrderLine(i,3);
		
	}

}
