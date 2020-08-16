package com.jspiders.solidprinciples.isp;

public class Canon implements Scanner, Printer, Faxxer {

	@Override
	public void fax() {
		
		System.out.println("Fax by Canon");

	}

	@Override
	public void print() {
		
		System.out.println("Print by Canon");
	}

	@Override
	public void scan() {
		
		System.out.println("Scan by Canon");

	}

}
