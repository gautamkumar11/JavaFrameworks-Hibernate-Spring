package com.jspiders.solidprinciples.dip;

public class ProductFactory {
	
	public static Product createProduct()
	{
		Product products = new SQLRepository();
		return products;
	}

}
