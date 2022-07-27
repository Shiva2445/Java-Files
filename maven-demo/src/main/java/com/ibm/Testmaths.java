package com.ibm;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testmaths {

	private maths maths;

	@BeforeEach
	public void init() {
		maths = new maths();
	}

	@Test
	public void testAdd() {
		assertEquals(10, maths.add(5, 5));
	}

	@Test
	public void testSubs() {
		assertEquals(5, maths.sub(10, 5));
	}

	@Test
	public void testDivValid() {
		assertEquals(2, maths.div(10, 5));
	}

	@Test
	public void testDivInvalid() {
		assertThrows(ArithmeticException.class, () -> maths.div(10, 0));
	}
}