package fr.univ.noel.utility;

import fr.univ.noel.beans.Product;

public class MinorPrice implements IStrategy{

	@Override
	public double computePrice(Product product) {
		return product.getPrice() * 0.9;
	}

}
