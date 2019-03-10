package model;

import java.util.ArrayList;

public class Bill {

	private ArrayList<Product> list;	//Will hold the list of products on the bill.
	private User user;					//Will hold the type of the user this bill belongs to.

	public Bill(User user) {
		// We save the type of user this bill belongs to.
		this.user = user;
		list = new ArrayList<Product>();
	}

	public void addProduct(Product p) {
		list.add(p);
	}

	public void removeProduct(Product p) {
		list.remove(p);
	}

	public User getUser() {
		return user;
	}

	public ArrayList<Product> getList() {
		return list;
	}

	public void setList(ArrayList<Product> list) {
		this.list = list;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
