package com.jspiders.solidprinciples.srp;

public class Mainclass {

	public static void main(String[] args) {
	 Student student = new Student();
	 student.setRegno(101);
	 student.setName("Gautam Kumar");
	 student.setBranch("IT");
	 
	 InsertStudentDetails studentDetails = new InsertStudentDetails();
	 studentDetails.insert(student);

	}

}
