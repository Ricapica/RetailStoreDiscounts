package model;

public class Product {

	private ProductType type;	//The type of the product.
	private double price;		//The price of the product.

	public Product(double p, ProductType t) {
		setPrice(p);
		type = t;
	}

	public String getItemType() {
		return type.getType();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
