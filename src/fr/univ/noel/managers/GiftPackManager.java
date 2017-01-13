package fr.univ.noel.managers;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.univ.noel.beans.GiftPack;
import fr.univ.noel.dao.Dao;

@Service
public class GiftPackManager {

	Dao dao;

	
	public GiftPackManager(){}
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
	public ArrayList<GiftPack> allGiftPacks(){
		return dao.getAllGiftPack();
	}
	
	public GiftPack getGiftPack(int id){
		return dao.getGiftPack(id);
	}
	
	public boolean save(GiftPack giftPack){
		return dao.addGiftPack(giftPack);
	}
	
	public boolean update(GiftPack giftPack){
		if(dao.getGiftPack(giftPack.getId()) != null)
			return dao.updateGiftPack(giftPack);
		
		return false;
	}
	
	public boolean delete(GiftPack giftPack){
		if(dao.getGiftPack(giftPack.getId()) != null)
			return dao.deleteGiftPack(giftPack);
		return false;
	}
}
