package com.javaintro;

public class Student1 {
	static String collage_name;
	static String location;
	int rollNo;
	String name, mobile, E_mail,branch;
	

	 public static void main(String[] args) {
		System.out.println("Collage name: "+collage_name);
		System.out.println("Location: "+location);
		
		Student1 s=new Student1();                                                                                                                                                                                                                                                                                           
		System.out.println("Roll No: "+s.rollNo);
		System.out.println("Name: "+s.name);
		System.out.println("Mobile: "+s.mobile);
		System.out.println("E-mail: "+s.E_mail);
		System.out.println("Branch: "+s.branch);
		
	}

}
