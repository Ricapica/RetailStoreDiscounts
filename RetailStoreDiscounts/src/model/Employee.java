package model;

public class Employee extends User{

	public Employee() {
		this.setDiscount(User.EMPLOYEE_DISCOUNT);
	}

	@Override
	public int getLoyalty() {
		// TODO Auto-generated method stub
		return 0;
	}
}
