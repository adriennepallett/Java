/**
 * File: AdrienneKT2ET.java
 * Assignment: Assignment 2 Question 1
 * Author: Adrienne Pallett
 * Version: Version 2.1.1 January 22, 2023
 * Purpose: This program converts Krypton temp to Earth Temp
 */

package Assign2;

import java.util.Scanner;

public class AdrienneKT2ET {

	public static void main(String[] args) {
				
		System.out.println("Kryptonites: This program will compare the tempertures of Earth & Krypton" + "\n");
		System.out.println("Enter the temperature on Krypton to determine the Earth temperature: ");
		Scanner inp = new Scanner (System.in);
		
		double adrienneKT = inp.nextDouble();
		
		double pallettET = (adrienneKT - 25) * (5.0 / 11);
		
		System.out.println(adrienneKT + " KT on Krypton is " + (int)pallettET + " ET on Earth");
		
		inp.close();
	}

}