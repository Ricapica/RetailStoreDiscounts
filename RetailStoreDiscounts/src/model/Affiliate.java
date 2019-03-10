package model;

public class Affiliate extends User{

	public Affiliate() {
		this.setDiscount(User.AFFILIATE_DISCOUNT);
	}

	@Override
	public int getLoyalty() {
		// TODO Auto-generated method stub
		return 0;
	}
}
