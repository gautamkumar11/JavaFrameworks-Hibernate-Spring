package com.jspiders.solidprinciples.isp;

public class Epson implements Printer, Scanner {

	@Override
	public void scan() {


		System.out.println("Print by Epson");
	}

	@Override
	public void print() {
		
		System.out.println("Scan by Epson");

	}

}
