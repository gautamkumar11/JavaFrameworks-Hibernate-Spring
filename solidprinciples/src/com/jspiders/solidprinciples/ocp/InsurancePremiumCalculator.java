package com.jspiders.solidprinciples.ocp;

public class InsurancePremiumCalculator {
	
	double discount = 20;
	public double calculate(Customer customer)
	{
		boolean bool = customer.isLoyalCustomer();
		if(bool==true)
		{
			return discount * 1.5;
		}
		return discount;
	}
}
