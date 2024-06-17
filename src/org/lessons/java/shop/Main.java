package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prodotto prodotto1 = new Prodotto("prod1", "desc1", 800 ,22);
		System.out.println("___________________________");
//		System.out.println(prodotto1.productPrice);
		System.out.println(prodotto1.price());
		System.out.println(prodotto1.priceAndCurrency());
		System.out.println(prodotto1.vatPrice());
		System.out.println(prodotto1.vatPriceAndCurrency());
		System.out.println(prodotto1.fullName());
		System.out.println("___________________________");
		
		
		System.out.println("___________________________");
		Prodotto prodotto2 = new Prodotto("prod2", "desc2", 128 ,22);
		System.out.println(prodotto2.productPrice);
		System.out.println(prodotto2.price());
		System.out.println(prodotto2.priceAndCurrency());
		System.out.println(prodotto2.vatPrice());
		System.out.println(prodotto2.vatPriceAndCurrency());
		System.out.println(prodotto2.fullName());
		System.out.println("___________________________");
	}

}
