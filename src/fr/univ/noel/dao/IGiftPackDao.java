package fr.univ.noel.dao;

import java.util.ArrayList;

import fr.univ.noel.beans.GiftPack;

public interface IGiftPackDao {
	
	public ArrayList<GiftPack> getAllGiftPack();
	
	public GiftPack getGiftPack(int id);
	
	public boolean addGiftPack(GiftPack giftPack);
	
	public boolean deleteGiftPack(GiftPack giftPack);
	
	public boolean updateGiftPack(GiftPack giftPack);
}
