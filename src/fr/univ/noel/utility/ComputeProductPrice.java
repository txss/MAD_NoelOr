package fr.univ.noel.utility;

import fr.univ.noel.beans.Product;

public class ComputeProductPrice {

	IStrategy minorStrategy = new MinorPrice();
	IStrategy normalStrategy = new NormalPrice();
	IStrategy majorStrategy = new MajorPrice();
	
	
	public double computePrice(Product product){
		
		if(product.getStock() > 100 ){
			return minorStrategy.computePrice(product);
		}else if(product.getStock() > 50){
			return normalStrategy.computePrice(product);
		}else{
			return majorStrategy.computePrice(product);
		}
		
	}
	
}
