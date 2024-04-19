/* Filename: PallettAssign5.java
 * Assignment: Assignment 5
 * Author: Adrienne Pallett
 * Version: 5.1 Date: February 12, 2023
 * Purpose: Refactoring to determine if-else cases
 */

package Assign5;

import java.util.Scanner;

public class Refactoring {

	public static void main(String[] args) {
		
		//getAdrienneChar_step1();
		//getAdrienneChar_step2();
		//getAdrienneChar_step3();
		//getAdrienneChar_step4();
		getAdrienneChar_step5();
		
	}
	
	/* Step 1
	
	public static void getAdrienneChar_step1() {
		
		// User Input
		System.out.print("Enter a letter between 'e' and 'o': ");
		Scanner user = new Scanner (System.in);
		String letter = user.next();
		System.out.println("You entered a " + letter);
		
		user.close();
	}
	*/
	
	/* Step 2 - Input Validation
	
	public static void getAdrienneChar_step2 () {
		
		// User Input
		System.out.print("Enter a letter between 'e' and 'o': ");
		Scanner user = new Scanner (System.in);
		String letter = user.next();
		
		// Change String to Char
		char l = letter.charAt(0);
				
		// If Statement to determine if char is between range
		if (l >= 'e' && l <= 'o') {
			System.out.println("You entered a " + letter);
		}
		else {
			System.out.println("Your letter is not between 'e' and 'o'.");
		}
		
		user.close();
	}
	*/
	
	/* Step 3 - Change Wording
	
	public static void getAdrienneChar_step3 () {
		
		// User Input
		System.out.print("Enter a letter between 'e' and 'o': ");
		Scanner user = new Scanner (System.in);
		String letter = user.next();
		
		// Change String to Char
		char l = letter.charAt(0);
		
		// If Else to determine if char is within range
		if (l >= 'e' && l <= 'o') {
		
			// Nested If Else to determine if char is a specific case
			if (l == 'e'||l == 'i'||l == 'o') {
				System.out.println("You entered an " + letter);
			}
			else {
				System.out.println("You entered a " + letter);
			}
		}
		else {
			System.out.println("Your letter is not between 'e' and 'o'.");
		}
		
		user.close();
	}
	*/
	
	/* Step 4 - Cases for Invalid Input Numbers & Special Characters
	
	public static void getAdrienneChar_step4 () {
		
		// User Input
		System.out.print("Enter a letter between 'e' and 'o': ");
		Scanner user = new Scanner (System.in);
		String letter = user.next();
		
		// Change String to Char
		char l = letter.charAt(0);
		
		// If Else to determine if char is within range
		if (Character.isLetter(l) == false) {
			System.out.println("Hellooo! Your input could not be read as a character. Please get a programming life!");
		}
		else {
			if (Character.isLetter(l) == true) {
				if (l >= 'e' && l <= 'o') {
					if (l == 'e'||l == 'i'||l == 'o') {
						System.out.println("You entered an " + letter);
					}
					else {
						System.out.println("You entered a " + letter);
					}
				}
				else {
					System.out.println("Your letter is not between 'e' and 'o'.");
				}
			}
		}
		user.close();
	}
	*/

	// Step 5 - Input Validation
	
	public static void getAdrienneChar_step5 () {
		
		// User Input
		System.out.print("Enter a letter between 'e' and 'o': ");
		Scanner user = new Scanner (System.in);
		String letter = user.next();

		// Change String to Char
		char l = letter.charAt(0);
		
		// Boolean case for While Loop
		boolean flag = false;
		
		if (l >= 'e' && l <= 'o') {
			flag = true;
		}
		
		// While Loop Input Validation
		while (flag == false) {
			System.out.println("You did not enter a letter between 'e' and 'o'. Try Again.: ");
			System.out.print("Enter a letter between 'e' and 'o': ");
			Scanner user2 = new Scanner (System.in);
			String letter2 = user2.next();
			
			l = letter2.charAt(0);
			
			if (l >= 'e' && l <= 'o') {
				flag = true;
			}
			user2.close();
		}
	
		// Nested If Else to determine if char is within range
		
		if (l >= 'e' && l <= 'o') {
			if (l == 'e'||l == 'i'||l == 'o') {
				System.out.println("You entered an " + l);
			}
			else {
				System.out.println("You entered a " + l);
			}
		}
		
		user.close();
	}
}
