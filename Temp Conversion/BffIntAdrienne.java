/* Filename: BffIntAdrienne.java
 * Assignment: Assignment 8
 * Author: Adrienne Pallett
 * Version: 8.1 Date: March 19, 2023
 * Purpose: Create a buffer array for an undefined main or array
 */

package Assign8;

import java.util.Random;

public class BffIntAdrienne {

	// Attributes
	private int[] bffr;
	private int count;
	
	// Non Arg Constructor
	BffIntAdrienne() {
		int BFFR_SZ = 8;
		bffr = new int[BFFR_SZ];
		count = 0;
	}
	
	// Argument Constructor
	BffIntAdrienne(int bff) {
		bffr = new int[bff];
		count = 0;
	}

	// Gets & Sets
	public int[] getBffr() {
		return bffr;
	}

	public int getCount() {
		return count;
	}

	public void setBffr(int[] bffr) {
		this.bffr = bffr;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void addRand() {
		Random r = new Random();
		bffr[count] = r.nextInt(10,100);
		count ++;
	}
	
	public String printToScreen() {
		String buff = " ";
		for (int i = 0; i < bffr.length; i++)
			buff += bffr[i] + " ";
		return buff;
	}
	
	public String toString() {
		String retStr = "";
		retStr += "Your array: " + printToScreen();
		retStr += "\nYour index count: " + getCount();
		return retStr;
	}
	
	
}
