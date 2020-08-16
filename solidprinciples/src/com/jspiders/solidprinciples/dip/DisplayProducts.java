package com.jspiders.solidprinciples.dip;

public class DisplayProducts {
	
	public void display()
	{
		
		Product product = ProductFactory.createProduct();
		int products = product.readProduct();
		
		System.out.println("Products per page is  = "+ products/10);
	}

}
