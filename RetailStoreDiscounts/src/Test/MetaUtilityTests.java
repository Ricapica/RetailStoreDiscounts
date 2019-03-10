package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Meta.MetaUtils;

class MetaUtilityTests {

	@Test
	void test() {
//		Tests for the essential utility methods.
		
//		The hundred dollar discount adds 5 for every completed hundred.
		assertEquals(5, MetaUtils.hundredDollarDiscount(100));
		assertEquals(0, MetaUtils.hundredDollarDiscount(99));
		assertEquals(25, MetaUtils.hundredDollarDiscount(555));
		assertEquals(5, MetaUtils.hundredDollarDiscount(101));

	}

}
