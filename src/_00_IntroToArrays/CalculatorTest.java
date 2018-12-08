package _00_IntroToArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@Test
	void testInt() {
		Calculator test= new Calculator();
		assertEquals(test.sum(1,1), 2);
		assertEquals(test.sum(-1, 1), 0);
		assertEquals(test.sum(1, -1), 0);
		assertEquals(test.sum(-2, -2), -4);
		//fail("Not yet implemented");
	}
	void testFloat() {
		Calculator test= new Calculator();
		assertEquals(test.floatSum(1.50,1.50), 3.0);
		assertEquals(test.floatSum(-1.50,1.50), 0.0);
		assertEquals(test.floatSum(1.25,-1.50), -0.25);
	}

}
