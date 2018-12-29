package _03_More_Array_Fun;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoreArrayFunTest {

	/*@Test
	void testPrintAll() {
		String[] names = { "Esme", "Isis", "Michiyo", "David"};
		String all = MoreArrayFun.printAll(names);
		assertEquals("Esme Isis Michiyo David", all);
	}*/
	
	/*@Test
	void testReverseOrder() {
		String[] names = { "Esme", "Isis", "Michiyo", "David"};
		String all = MoreArrayFun.reverseOrder(names);
		assertEquals("David Michiyo Isis Esme", all);
	}*/
	
	@Test
	void testEveryOther() {
		String[] names = { "Esme", "Isis", "Michiyo", "David", "John"};
		String all = MoreArrayFun.everyOther(names);
		assertEquals("Esme Michiyo John", all);
	}

}
