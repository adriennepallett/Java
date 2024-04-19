/* Filename: Footwear.java
 * Assignment: Assignment 7
 * Author: Adrienne Pallett
 * Version: 7.1 Date: March 10,2023
 * Purpose: Create a footwear class
 */

package Assign7;

public class Footwear {

	// Attributes
	private String brand; 
	private int size;
	private String description;
	private int weightInOunces;
	private double price;
	private int quantity;
	
	// Non Arg Constructor
	Footwear() {
		brand = "Unknown";
		size = -1;
		description = "Plain Shoe";
		weightInOunces = 0;
		price = 0.0;
		quantity = 1;
	}
	
	// Argument Constructor
	Footwear(String br,int sz, String desc, int wio, double pr) {
		brand = br;
		size = sz;
		description = desc;
		weightInOunces = wio;
		price = pr;
		quantity = 1;
	}

	// Getters - Accessors
	public String getBrand() {
		return brand;
	}

	public int getSize() {
		return size;
	}

	public String getDescription() {
		return description;
	}

	public int getWeightInOunces() {
		return weightInOunces;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	// Setters - Mutators
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setWeightInOunces(int weightInOunces) {
		this.weightInOunces = weightInOunces;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// Methods
	// Get Order Price
	public double getOrderPrice() {
		double dTotalPrice = 0.0;
		dTotalPrice += price * quantity;
		return dTotalPrice;
	}
	
	// Get Order Weight In Ounces
	public int getOrderWeightInOunces() {
		int orderWeightInOunces = 0;
		orderWeightInOunces += weightInOunces * quantity;
		return orderWeightInOunces;
	}
	
	public String toString() {
		String retStr = "";
		retStr += "$" + price + " each for " + quantity + " " + brand + " " + description + " of size " + size + ".";
		return retStr;
	}
}
