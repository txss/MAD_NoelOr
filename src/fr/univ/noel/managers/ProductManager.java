package fr.univ.noel.managers;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.univ.noel.beans.Product;
import fr.univ.noel.dao.Dao;
import fr.univ.noel.utility.ComputeProductPrice;

@Service
public class ProductManager {
	
	Dao dao = new Dao();
	ComputeProductPrice compute = new ComputeProductPrice();
	
	public ProductManager(){}
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
	public ArrayList<Product> allProduct(){ // TODO ajouter la fonction de calcul du prix
		return dao.getAllProducts();
	}
	
	public Product getProduct(int id){
		Product p = dao.getProduct(id);
		p.setPrice( compute.computePrice(p) );
		return p;
	}
	
	public boolean updateProduct(Product product){
		
		if(getProduct(product.getId()) != null)
			return dao.updateProduct(product);
		
		return false;
	}
	
	
	public boolean saveProduct(Product product){
		return dao.saveProduct(product);
	}
	
	public boolean deleteProduct(Product product){
		
		if(getProduct(product.getId()) != null)
			return dao.deleteProduct(product);
			
		return false;
	}
	
}
