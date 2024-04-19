/* Filename: PallettAssgn3.java
 * Assignment: Assignment 3 - Program 2
 * Author: Adrienne Pallett
 * Version: 3.1 January 29, 2023
 * Purpose: iterate through special characters
 */

import java.util.Scanner; 

public class NestedRows {

    public static void main(String[] args) {
        Scanner nested = new Scanner (System.in);

        System.out.println("This program will display the number of rows in '#' and with each new row, change 1 '#' to a '$'." + "\n");
		
		// Variable Assignment
		int numRows;
		
		// User Inputs
		System.out.print("Enter the number of rows: ");
		numRows = nested.nextInt();
		
		// Program Two Function Call
		nestedAdrienne(numRows);

        nested.close();
    }

    public static void nestedAdrienne(int rows) {
				
		String amp = "$";
		String hash = "#";
		int counter = 2;
		
		for (int i = 1; i <= rows; i++) {
			counter -=1;
			for (int j = 1; j <= i; j++) {
				System.out.print(hash);
			}
			while (counter < rows) {
				System.out.print(amp);
				counter ++;
			}
			System.out.println();
		}
	}   
}
