package fr.univ.noel.utility;

import fr.univ.noel.beans.Product;

public class MajorPrice implements IStrategy{

	@Override
	public double computePrice(Product product) {
		return product.getPrice() * 2;
	}

}
