package fr.univ.noel.beans;

public class Product {

	private int id;
	private double price;
	private String name;
	private int stock;
	
	
	
	public Product(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public int getStock() {
		return stock;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
