package model;

public abstract class User {

	//Configuration variables for the different discount values.
	public static float NO_DISCOUNT = 0;
	public static float LOYALTY_DISCOUNT = 5;
	public static float EMPLOYEE_DISCOUNT = 30;
	public static float AFFILIATE_DISCOUNT = 10;
	
	
	private float discount;

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public abstract int getLoyalty();
}
