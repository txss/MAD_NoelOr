package test;

import static org.junit.Assert.*;

import fr.univ.noel.managers.ProductManager;

public class Test {

	ProductManager prodManager = new ProductManager();
	
	
	
	@org.junit.Test
	public void testComputePrice() {
		double price = prodManager.getProduct(0).getPrice();
		assertEquals(0.45, price, 0.1);
	}

	
}
