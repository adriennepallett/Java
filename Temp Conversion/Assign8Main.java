/* Filename: Assign8Main.java
 * Assignment: Assignment 8
 * Author: Adrienne Pallett
 * Version: 8.2 Date: March 21 2023
 * Purpose: Main for TmpAdrienne.java
 */
package Assign8;

import java.util.Scanner;

public class Assign8Main extends TmpAdrienne {

	Assign8Main(double t) {
		super(t);
	}

	public static void main(String[] args) {
		
		getTempFromUser();
		
	}
	
	public static void getTempFromUser() {
		System.out.println("I will ask you for a temperature and its units. Use C for Celsius, F for Fahrenheit or K for Kelvin");
		System.out.print("Enter a temperature followed by the units: ");
		Scanner inp = new Scanner(System.in);
		double t = inp.nextDouble();
		String m = inp.next();
		
		if (m.contains("F"))
			t = t;
		else if (m.contains("C"))
			t = ((t * 9.0/5) + 32);
		else if (m.contains("K"))
			t = ((t - 273.15 * 9.0/5) + 32);
		else
			System.out.println("Invalid input. Please tey again");
		
		TmpAdrienne T1 = new TmpAdrienne(t);
		System.out.println(T1);
		
		
		
	}

}
