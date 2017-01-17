package fr.univ.noel.dao;

import java.util.ArrayList;

import fr.univ.noel.beans.GiftPack;
import fr.univ.noel.beans.Product;

public class Dao implements IGiftPackDao, IProductDao {

	
	
	ArrayList<Product> prods = new ArrayList<Product>();
	ArrayList<GiftPack> giftpacks = new ArrayList<GiftPack>();
	
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
		p1.setStock(51);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("souris");
		p2.setPrice(10);
		p2.setStock(10);
		
		prods.add(p0);
		prods.add(p1);
		prods.add(p2);
		
		GiftPack g0 = new GiftPack();
		g0.setId(0);
		g0.setProducts(prods);
		
		ArrayList<Product> prod1 = new ArrayList<Product>();
		prod1.add(p2);
		prod1.add(p0);
		
		GiftPack g1 = new GiftPack();
		g1.setId(1);
		g1.setProducts(prod1);
		
		
		ArrayList<Product> prod2 = new ArrayList<Product>();
		prod2.add(p1);
		prod2.add(p2);
		
		GiftPack g2 = new GiftPack();
		g2.setId(2);
		g2.setProducts(prod2);
		
		giftpacks.add(g0);
		giftpacks.add(g1);
		giftpacks.add(g2);
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
		prods.remove(product.getId());
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		prods.get(product.getId()).setStock(product.getStock());
		return true;
	}

	@Override
	public ArrayList<GiftPack> getAllGiftPack() {
		return giftpacks;
	}

	@Override
	public GiftPack getGiftPack(int id) {
		return giftpacks.get(id);
	}

	@Override
	public boolean addGiftPack(GiftPack giftPack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteGiftPack(GiftPack giftPack) {
		giftpacks.remove(giftPack.getId());
		return false;
	}

	@Override
	public boolean updateGiftPack(GiftPack giftPack) {
		return false;
	}

}
