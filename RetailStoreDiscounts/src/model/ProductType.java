package model;

public enum ProductType {
	
	GROCERIES("Groceries"),
	WEARABLE("Wearable"),
	GADGET("Gadget"),
	FURNITURE("Furniture"),
	BOOK("Book");

	private final String type;

	ProductType(String t) {
		type = t;
	}

	public String getType() {
		return type;
	}

}