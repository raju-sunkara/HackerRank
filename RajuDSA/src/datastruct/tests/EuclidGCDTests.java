package datastruct.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import datastruct.EuclidGCD;

class EuclidGCDTests {

	EuclidGCD eg=new EuclidGCD();
	@Test
	void testFindGCD1() {
		assertEquals(4,eg.findGCD(12,4));
		
	}
	@Test
	void testFindGCD2() {
		assertEquals(1,eg.findGCD(12,5));
	}
	@Test
	void testFindGCD3() {
		assertEquals(6,eg.findGCD(12,6));
	}
	@Test
	void testFindGCDWithZero() {
		assertEquals(0,eg.findGCD(12,0));
	}
}
