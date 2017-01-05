package fr.univ.noel.dao;

import java.util.ArrayList;

import fr.univ.noel.beans.GiftPack;
import fr.univ.noel.beans.Product;

public class Dao implements IGiftPackDao, IProductDao {

	
	
	
	
	@Override
	public ArrayList<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
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
