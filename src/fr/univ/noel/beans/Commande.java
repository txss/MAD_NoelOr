package fr.univ.noel.beans;

import java.util.ArrayList;

public class Commande {

	private int id;
	private double price;
	private ArrayList<Product> products;
	
	public Commande(){
		
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
}
