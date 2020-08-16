package com.jspiders.solidprinciples.ocp;

public class Mainclass {

	public static void main(String[] args) {
		
		Customer health = new HealthInsuranceCustomer();
		InsurancePremiumCalculator calculator = new InsurancePremiumCalculator();
		double discount = calculator.calculate(health);
		System.out.println("HealthInsuranceCustomer got a discount of: "+discount+"%");
		
		Customer home = new HomeInsuranceCustomer();
		InsurancePremiumCalculator calculator1 = new InsurancePremiumCalculator();
		double discount1 = calculator1.calculate(home);
		System.out.println("HomeInsuranceCustomer got a discount of: "+discount1+"%");


	}

}
