package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

import Meta.MetaUtils;
import model.*;

class BillTests {

	@Test
	void test() {

		Calendar cal = Calendar.getInstance();

//		Creating our User base, 1 of each type.
		User employee = new Employee();
		User affiliate = new Affiliate();
		User newCustomer = new Customer(cal.getTime());
		User newCustomer2 = new Customer(cal.getTime());
		cal.add(Calendar.YEAR, -2);
		User loyalCustomer = new Customer(cal.getTime());

//		Creating our Product base.
		Product fruit = new Product(100.0, ProductType.GROCERIES);
		Product vegetable = new Product(50.0, ProductType.GROCERIES);
		Product rcHelicopter = new Product(200.0, ProductType.GADGET);
		Product couch = new Product(1000.0, ProductType.FURNITURE);
		Product shirt = new Product(20.0, ProductType.WEARABLE);
		Product book = new Product(100.0, ProductType.BOOK);

//		 Mix of groceries and non-groceries, no discount.
		Bill bill1 = new Bill(newCustomer);
		bill1.addProduct(book); // 100
		bill1.addProduct(vegetable); // 50
		bill1.addProduct(vegetable); // 50
		assertEquals(190, MetaUtils.calculateBillTotal(bill1)); // 0% discount 10$ off

//		 No groceries, only discount.
		Bill bill2 = new Bill(loyalCustomer);
		bill2.addProduct(couch); // 950
		assertEquals(905, MetaUtils.calculateBillTotal(bill2)); // 5% discount, 45$ off

//		 Another mix with a bigger discount.
		Bill bill3 = new Bill(affiliate);
		bill3.addProduct(fruit); // 100
		bill3.addProduct(rcHelicopter); // 180
		assertEquals(270, MetaUtils.calculateBillTotal(bill3)); // 10% discount but only on 200 non-grocery. 10$ off

//		 No mix, larger discount.
		Bill bill4 = new Bill(employee);
		bill4.addProduct(shirt); // 16
		bill4.addProduct(shirt); // 16
		bill4.addProduct(shirt); // 16
		bill4.addProduct(shirt); // 16
		bill4.addProduct(shirt); // 16
		bill4.addProduct(book); // 70
		assertEquals(135, MetaUtils.calculateBillTotal(bill4)); // 30% discount, 5$ off

//		 Only groceries, no discount
		Bill bill5 = new Bill(newCustomer2);
		bill5.addProduct(fruit);
		bill5.addProduct(fruit);
		bill5.addProduct(fruit);
		assertEquals(285, MetaUtils.calculateBillTotal(bill5));
	}

}
