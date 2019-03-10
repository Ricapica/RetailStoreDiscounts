package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

import model.*;

class ModelBuildTests {

	@Test
	void test() {
//		 Test if the loyalty is calculated correctly
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -2);
		
//		 We create a customer that has been frequenting us for 2 year.
		User customer = new Customer(cal.getTime());
		assertEquals(2, customer.getLoyalty());					//Loyalty should be 2 years.
		assertEquals(5, customer.getDiscount());				//Discount for 2 years is 5%.

//		 We create another customer that has been frequenting us for 1 year.
		cal.add(Calendar.YEAR, 1);
		User customer2 = new Customer(cal.getTime());
		assertEquals(1, customer2.getLoyalty());				//Loyalty should be 1 year.
		assertEquals(0, customer2.getDiscount());				//Discount for 1 year is 0%.
		
//		Testing the affiliate discount.
		User affiliate = new Affiliate();
		assertEquals(10, affiliate.getDiscount());				//Discount for affiliates is 10%.
		
//		Testing the employee discount.
		User employee = new Employee();
		assertEquals(30, employee.getDiscount());				//Discount for employees is 30%.
	}

}
