package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	
	private static int productCode;
	private String productName;
	private String productDescription;
	private int productPrice;
	private int vat;
	
	public Prodotto(String productName, String productDescription, int productPrice, int vat) {
		
		int minValue = 0;
		int maxValue = 999999;
		Random randomCode = new Random();
		
		this.productCode = randomCode.nextInt(maxValue - minValue) + minValue;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.vat = vat;
		
	}
	
								
	//--------------get method---------------------------
	
	public String getProductName() {
		return productName;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	
	public int getPrice() {
		return productPrice;
	}
	
	public int getVat() {
		return vat;
	}
	
	//------------------------------------------------------------------
	
	//--------------set method---------------------------
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public void setVat(int vat) {
		this.vat = vat;
	}
	public void setPriceAndCurrency(int priceAndCurrency ) {
		this.productPrice = priceAndCurrency;
	}
	
	public void setPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	//------------------------------------------------------------------
	
	
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
