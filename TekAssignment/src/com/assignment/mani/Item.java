package com.assginment.mani;

public class Item {

	private String description;
	private float price;

	public Item(String description, float price) {
		super();
		this.description = description;
//		this.price = price;
		setPrice(price);
	}

	public String getDescription() {
		return description;
	}
	
	public void setPrice(float price){
		if(price > 0){
			this.price = price;
		}
	}

	public float getPrice() {
		return price;
	}
}