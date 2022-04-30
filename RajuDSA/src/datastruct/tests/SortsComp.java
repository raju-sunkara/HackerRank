package datastruct.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.ThreadLocalRandom;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datastruct.*;

class SortsComp {

	InsertionSort is=new InsertionSort();
	BubbleSort bs=new BubbleSort();
	SelectionSort ss=new SelectionSort();
	
	public static int LOWER=0, 
				UPPER=200,
				SIZE=100;
	int basket[]=new int[SIZE];//= {10,9,8,7,6,5};
	int sbasket[]= new int[SIZE];//={5,6,7,8,9,10};
	
	public void prepareTestData() {
		//Generate RANDOM Array 
				for (int i=0;i<SortsComp.SIZE;i++) {
					basket[i]=ThreadLocalRandom.current().nextInt(SortsComp.LOWER,SortsComp.UPPER);
				}
				sbasket=is.sort(basket);
	}
	
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
	void testRightbs() {
		prepareTestData();
		for (int i=0;i<SortsComp.SIZE;i++) {
			System.out.println(basket[i]);
		}
		
		assertEquals(Arrays.toString(sbasket),Arrays.toString(bs.sort(basket)));
	}
	@Test
	void testRightis() {
		
		assertEquals(Arrays.toString(sbasket),Arrays.toString(is.sort(basket)));
	}
	@Test
	void testRightss() {
		
		assertEquals(Arrays.toString(sbasket),Arrays.toString(ss.sort(basket)));
	}
	

}
