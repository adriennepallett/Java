/*
 * File: N02074665_2.java
 * Assignment: Assignment 2 Question 2
 * Author: Adrienne Pallett
 * Version: Version 2.2.1 January 22, 2023
 * Purpose: This program determine the max among 3 user entered values
 */
package Assign2;

import java.util.Scanner;

public class N02076445_2 {

	public static void main(String[] args) {
			
		System.out.println("This program will find the largest number that you enter.");
		
		System.out.println("Enter 3 whole numbers separated by a space: ");
		Scanner inp = new Scanner (System.in);
		
		int x = inp.nextInt();
		int y = inp.nextInt();
		int z = inp.nextInt();
		
		if (x >= y && x >= z)
			System.out.println("The largest number amongst " + x + ", " + y + " and " + z + " is " + x);
		else if (y >= x && y >= z)
			System.out.println("The largest number amongst " + x + ", " + y + " and " + z + " is " + y);
		else if (z >= x && z >= y)
			System.out.println("The largest number amongst " + x + ", " + y + " and " + z + " is " + z);
		
		inp.close();
	}
}


