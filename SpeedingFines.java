/* Filename: PallettAssgn3.java
 * Assignment: Assignment 3 Program 1
 * Author: Adrienne Pallett
 * Version: 3.1 January 29, 2023
 * Purpose: Calculate speeding fines
 */
package Assign3;

import java.util.Scanner; 

public class Assign3 {

	static Scanner speeding = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		// Speed Limit Program //
		System.out.println("This program will calculate speeding fines for your county." +"\n");
		
		// Variable Assignments
		int speedLimitAdrienne, speedAdrienne;
		String driv_teenAdrienne;
		
		// User Inputs
		System.out.print("Speed Limit: ");
		speedLimitAdrienne = speeding.nextInt();
		
		System.out.print("Your Speed: ");
		speedAdrienne = speeding.nextInt();
		
		System.out.print("Teen Driver?: ");
		driv_teenAdrienne = speeding.next();
		
		// Program One Function Call
		speedFineCalcAdrienne(speedLimitAdrienne,speedAdrienne,driv_teenAdrienne);
		
		// Close the Scanner
		speeding.close();
		
	}
	
	public static void speedFineCalcAdrienne (int limit,int speed, String teen) {
				
		// While Loop Input Validation for Teen Driver
		while ((teen.equalsIgnoreCase("T")||teen.equalsIgnoreCase("N")||teen.equalsIgnoreCase("Teen")||teen.equalsIgnoreCase("N")) == false){
			System.out.println("Your entry for teen is invalid, please try again.");
			System.out.println("Please enter 'Teen', 'T', 'No', 'N' for teen driver: ");
			teen = speeding.next();	
		}
		
		// Fine Variables
		int milesOver = (speed-limit);
		int zone = 0;
		
		// Determine Fine
		double fine = 0;
		
		// If-ElseIf-Else Case to assign zones
		if (milesOver <= 0) {
			zone = 0;
		}
		else if (milesOver < 5) {
			zone = 1;
			fine = 39.5;
		}
		else if (milesOver < 15) {
			zone = 2;
			fine = 89.00;
		}
		else if (milesOver < 25) {
			zone = 3;
			fine = 109.50;
		}
		else if (milesOver < 35) {
			zone = 4;
			fine = 149.99;
		}
		else {
			zone = 5;
			fine = 0.00;
		}
		
		// Teen Driver gets fine tripled
		if ((teen.equalsIgnoreCase("T")||teen.equalsIgnoreCase("Teen")) == true) {
			fine = (fine * 3);
		}
		
		// Fine Display
		System.out.printf("Total Fine Calculated: $" + "%4.2f\n",fine);
		
		// Switch Case for Display Message
		switch (zone) {
			case 1:
				System.out.println("You can do better as a driver!");
				break;
			case 2:
				System.out.println("Reduce your speed!");
				break;
			case 3:
				System.out.println("Be careful, you are driving reckless!");
				break;
			case 4:
				System.out.println("You are over-speeding!");
				break;
			case 5:
				System.out.println("Fine has to be calculated by court!");
				break;
			default:
				System.out.println("You are a good driver!");
		}
		
	}
	
	
}
