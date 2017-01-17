package fr.univ.noel.utility;

import fr.univ.noel.beans.Product;

public class NormalMinorMajor implements IStrategy{

	public double computePrice(Product product){
		
		if(product.getStock() > 100 ){
			return product.getPrice() * 0.9;
		}else if(product.getStock() > 50){
			return product.getPrice();
		}else{
			return product.getPrice() *2;
		}
		
	}
	
}
