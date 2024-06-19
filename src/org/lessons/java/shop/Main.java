package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a Scanner object	
		Scanner scanner = new Scanner(System.in); 
		
		String userProdName;
		String userProdInfo;
		int userProdPrice;
		int userProdIva;
		
		
		 
		
	    System.out.println("Enter the product name");
	    userProdName = scanner.nextLine();
	    System.out.println("Enter the product detils");
	    userProdInfo = scanner.nextLine();
	    System.out.println("Enter the product Price");
	    userProdPrice = scanner.nextInt();
	    System.out.println("Enter the product IVA");
	    userProdIva = scanner.nextInt();

		Prodotto userProd = new Prodotto(userProdName, userProdInfo, userProdPrice, userProdIva);
		
		System.out.println("--------------------------------------");
		System.out.println(userProd.getProductName());
		System.out.println(userProd.getProductDescription());
		System.out.println(userProd.getPrice());
		System.out.println(userProd.vatPriceAndCurrency());
		System.out.println(userProd.fullName());
	}

	

}
