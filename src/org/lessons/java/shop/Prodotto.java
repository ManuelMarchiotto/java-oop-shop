package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	
	protected int productCode;
	String productName;
	String ProductDescription;
	int productPrice;
	int vat;
	
	public Prodotto(String productName, String ProductDescription, int productPrice, int vat) {
		
		int minValue = 111111;
		int maxValue = 999999;
		Random randomCode = new Random();
		
		this.productCode = randomCode.nextInt(maxValue - minValue) + minValue;
		this.productName = productName;
		this.ProductDescription = ProductDescription;
		this.vat = vat;
	}
	
	public int price() {
		return productPrice;
	}
	
	public String priceAndCurrency() {
		String priceAndCurrency = productPrice + "€";
		return priceAndCurrency;
	}
	
	public int vatPrice() {
		int vatPrice = (productPrice + (productPrice * vat) / 100);
		return vatPrice;
	}
	
	public String vatPriceAndCurrency() {
		String vatPrice = (productPrice + (productPrice * vat) / 100) + "€";
		return vatPrice;
	}
	
	public String fullName() {
		String fullNameString = productCode + "-" + productName;
		return fullNameString;
	}
}
