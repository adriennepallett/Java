/* Filename: TmpAdrienne.java
 * Assignment: Assignment 8
 * Author: Adrienne Pallett
 * Version: 8.2 Date: March 21 2023
 * Purpose: Temperature class
 */
package Assign8;

public class TmpAdrienne {

	// Attributes
	private double tmp;
	
	// Argument Constructor
	TmpAdrienne(double t) {
		tmp = t;
	}
	
	// Get
	public double getTmp() {
		return tmp;
	}
	
	// Set
	public void setTmp(double tmp) {
		this.tmp = tmp;
	}
	
	// Methods
	public double getFar() {
		return Math.round(tmp*100.0)/100.0;
	}
	
	public double getCel() {
		double cel = Math.round((tmp - 32) * 5.0/9*100.0)/100.0;
		return cel;
	}
	
	public double getKel() {
		double kel = Math.round((tmp + 459.67) * 5.0/9 * 100.0)/100.0;
		return kel;
	}
	
	public String toString() {
		String retStr = "";
		retStr += "Your temperature in Farenheit is: " + getFar();
		retStr += "\nYour temperature in Celsius is: " + getCel();
		retStr += "\nYour temperature in Kelvin is: " + getKel();
		return retStr;
	}
}
