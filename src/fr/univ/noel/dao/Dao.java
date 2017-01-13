package fr.univ.noel.dao;

import java.util.ArrayList;

import fr.univ.noel.beans.GiftPack;
import fr.univ.noel.beans.Product;

public class Dao implements IGiftPackDao, IProductDao {

	
	
	ArrayList<Product> prods = new ArrayList<Product>();
	
	
	public Dao() {
		Product p0 = new Product();
		p0.setId(0);
		p0.setName("Stylo");
		p0.setPrice(0.50);
		p0.setStock(1000);
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("feuilles");
		p1.setPrice(1.5);
		p1.setStock(50);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("souris");
		p2.setPrice(10);
		p2.setStock(10);
		
		prods.add(p0);
		prods.add(p1);
		prods.add(p2);
	}
	
	
	@Override
	public ArrayList<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return prods;
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setId(prods.get(id).getId());
		p.setName(prods.get(id).getName());
		p.setPrice(prods.get(id).getPrice());
		p.setStock(prods.get(id).getStock());
		return p;
	}

	@Override
	public boolean saveProduct(Product product) {
//		prods.add(product);
		return true;
	}

	@Override
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<GiftPack> getAllGiftPack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GiftPack getGiftPack(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addGiftPack(GiftPack giftPack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteGiftPack(GiftPack giftPack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateGiftPack(GiftPack giftPack) {
		// TODO Auto-generated method stub
		return false;
	}

}
