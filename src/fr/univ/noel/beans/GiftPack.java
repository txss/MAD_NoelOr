package fr.univ.noel.beans;

import java.util.ArrayList;

public class GiftPack {
	
	private int id;
	private ArrayList<Product> products;
	
	public GiftPack(){
		
	}

	public int getId() {
		return id;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

}
