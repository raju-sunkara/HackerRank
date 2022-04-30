package datastruct.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datastruct.InsertionSort;

class InsertionSortTests {

	InsertionSort bs=new InsertionSort();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRight() {
		int[] basket= {10,9,8,7,6,5};
		int[] sbasket={5,6,7,8,9,10};
		assertEquals(Arrays.toString(sbasket),Arrays.toString(bs.sort(basket)));
	}
	@Test
	void testRight1() {
		int[] basket= {11,9,8,7,6,5};
		int[] sbasket={5,6,7,8,9,10};
		assertEquals(Arrays.toString(sbasket),Arrays.toString(bs.sort(basket)));
	}

}
