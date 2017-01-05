package fr.univ.noel.dao;

import java.util.ArrayList;

import fr.univ.noel.beans.Product;



public interface IProductDao {

	
	public ArrayList<Product> getAllProducts();
	
	public Product getProduct(int id);
	
	public boolean saveProduct(Product product);
	
	public boolean deleteProduct(Product product);
	
	public boolean updateProduct(Product product);
	
}
