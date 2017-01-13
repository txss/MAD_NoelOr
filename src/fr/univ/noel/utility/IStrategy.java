package fr.univ.noel.utility;

import fr.univ.noel.beans.Product;

public interface IStrategy {
	public double computePrice(Product product);
}
