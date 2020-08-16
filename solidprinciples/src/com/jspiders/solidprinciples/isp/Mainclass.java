package com.jspiders.solidprinciples.isp;

public class Mainclass {
	
	public static void main(String args[]) {
		
		
		Hp hp = new Hp();
		hp.print();
		
		Epson epson = new Epson();
		epson.print();
		epson.scan();
		
		Canon canon = new Canon();
		canon.print();
		canon.scan();
		canon.fax();
		
	}

}
