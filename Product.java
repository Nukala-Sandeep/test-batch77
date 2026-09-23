package com.javaintro;

public class Product {
	public int productId;
	String productName;
	double productPrice;
	String productInfo;
	static String companyName;
	public void display() {
		companyName="Sunfiet";
		System.out.println("Company Name: "+companyName);
	}
	public void show() {
		
		System.out.println("Product Id: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+productPrice);
		System.out.println("Product Info: "+productInfo);
		
	}
	public static void main(String[] args) {
		Product p1=new Product();
		p1.productId=123;
		p1.productName="Cookies";
		p1.productPrice=10.00;
		p1.productInfo="It is a snak";
		
		p1.display();
		p1.show();
		
	}

}
