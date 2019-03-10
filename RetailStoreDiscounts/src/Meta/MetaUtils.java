package Meta;

import model.Bill;
import model.Product;

/*
 * This class will hold the essential methods or services for the project.
 */
public class MetaUtils {

	static final int HUNDRED_DOLLAR_DISCOUNT = 5;			//Configuration Value for the hundred dollar discount;

	public static double calculateBillTotal(Bill bill) {
		double total = 0.0;
		for (Product product : bill.getList()) {
			// We iterate over each product on the bill.
			if (product.getItemType().equals("Groceries")) {
				// Groceries products do not have their discount applied.
				total += product.getPrice();
			} else {
				// Non-groceries products will have their price added to the total, with the
				// user type's discount.
				total += product.getPrice() - (product.getPrice() * bill.getUser().getDiscount() / 100);
			}
		}
		// Subtract five dollars for each hundred dollar.
		total -= hundredDollarDiscount(total);
		return total;
	}

	public static double hundredDollarDiscount(double amount) {
		double result = 0.0;
		int hundreds = ((int) amount) / 100;
		result = HUNDRED_DOLLAR_DISCOUNT * hundreds;
		return result;
	}
}
