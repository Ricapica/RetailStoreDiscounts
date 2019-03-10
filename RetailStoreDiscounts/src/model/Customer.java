package model;

import java.util.Date;
import Utility.DateMethods;

public class Customer extends User {
	private Date customerSince; // This will hold the join date of our customer.

	public Customer(Date date) {
		customerSince = date;
		if (this.getLoyalty() >= 2) { // If we are entering an old customer to the system, he will be instantly given
										// the discount.
			this.setDiscount(User.LOYALTY_DISCOUNT);
		} else {
			this.setDiscount(User.NO_DISCOUNT);
		}
	}

	public Date getCustomerSince() {
		return customerSince;
	}

	public void setCustomerSince(Date setDate) {
		customerSince = setDate;
	}

	public int getLoyalty() {
		// Will return the number of years the customer has been loyal.
		return DateMethods.getDiffYears(customerSince, new Date());
	}

}
