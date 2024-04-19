/* Filename: Lotto.java
 * Assignment: Assignment 4
 * Author: Adrienne Pallett
 * Version: 4.1 Date: February 5, 2023
 * Purpose: Create a lottery game using a method with just numbers and method with just strings
 */

package Assign4;

import java.util.Scanner;

public class Lotto {
	
	public static void main (String[] args) {
		
		System.out.println("This is a lottery game. \n If you match the exact number, the number backwards or a part of the number, You WIN! \n");
		
		lottoNumAdrienne();
		lottoStrAdrienne();
	}

	private static void lottoNumAdrienne() {
					
		// User Picks A Number
		System.out.print("Please enter a three digit number between 100 & 999: ");
		Scanner lottoNum = new Scanner (System.in);
		int userNum = lottoNum.nextInt();
		
		/// Math.Random Picks A Number
		double randomNum = Math.random();
		int lotteryNum = (int) (100 + 899 * randomNum) ;
		System.out.println("Lottery number is: " + lotteryNum);
			
		
		// Reverse of the Number
		int reverse = 0;
		int lottLoop = lotteryNum;
		
		while (lottLoop != 0) {
			int num = lottLoop % 10;
			reverse = reverse * 10 + num;
			lottLoop /= 10;
		}
				
		// A Continuous Part of the Number
		int lottSetX = (int)Math.floor(lotteryNum / 10);
		int lottSetY = lotteryNum -(100 * Math.floorDiv(lotteryNum,100));
		int userSetX = (int)Math.floor(userNum / 10);
		int userSetY = userNum -(100 * Math.floorDiv(userNum,100));
		
		
		// If the Number is an Exact Match
		
		double winnings = 0.00;
				
		if (userNum == lotteryNum) {
			winnings = 10000.00;
			System.out.printf("Great Guess! You won $%.2f", + winnings);
		}
		// If the Number is a Reverse Match
		else if (userNum == reverse) {
			winnings = 7000.00;
			System.out.printf("Close! You won $%5.2f", + winnings);
		}
		// If the Number is a Continuous Match
		else if ( (lottSetX == userSetX)||(lottSetY == userSetY)) {
			winnings = 3000.00;
			System.out.printf("You were sort of close... You won $.2f", + winnings);
		}
		// No Match
		else {
			System.out.println("Better luck next time");
		}
		System.out.println();
	}

	private static void lottoStrAdrienne() {
		
		// User Number Picker
		System.out.print("\nPlease enter a three digit number between 100 & 999: ");
		Scanner lottoNum = new Scanner (System.in);
		String userStr = lottoNum.next();
		
		// Lottery Number Picker
		double randomStr = Math.random();
		int lottStr = (int) (100 + 899 * randomStr);
		String lotteryStr = Integer.toString(lottStr);
		System.out.println("Lottery number is: " + lotteryStr);
		
		// Reverse Match
		char nums;
		String newUserStr = "";
		
	    for (int i = 0; i < userStr.length(); i++) {
	    	nums = userStr.charAt(i);
	    	newUserStr = nums + newUserStr;
	    }
	  
		// Continuous Match
	    char lottX = lotteryStr.charAt(0);
		char lottY = lotteryStr.charAt(1);
		char lottZ = lotteryStr.charAt(2);
		
		char userX = userStr.charAt(0);
		char userY = userStr.charAt(1);
		char userZ = userStr.charAt(2);
		
		
		// Results
		if (lotteryStr.equals(userStr)) {
			System.out.println("You are lucky, you won $10,000");
		}
		else if (lotteryStr.equals(newUserStr)) {
			System.out.println("You're almost there. you won $7,000");
		}
		else if ( (lottX == userX)&&(lottY == userY)||(lottY == userY)&&(lottZ == userZ)) {
			System.out.println("You won $3,000");
		}
		else {
			System.out.println("Better luck next time.");
		}
		lottoNum.close();
	}
}
