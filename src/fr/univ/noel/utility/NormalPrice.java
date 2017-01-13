package fr.univ.noel.utility;

import fr.univ.noel.beans.Product;

public class NormalPrice implements IStrategy{

	@Override
	public double computePrice(Product product) {
		return product.getPrice();
	}

}
