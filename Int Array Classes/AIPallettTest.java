/* Filename: AIPallettTest.java
 * Assignment: Assignment 6
 * Author: Adrienne Pallett
 * Version: 6.1 Date: February 25, 2023
 * Purpose: Manipulate an array of functions using classes
 */

package Assign6;

import java.util.Scanner;

public class AIPallettTest {

public static void main(String[] args) {
	
	int [] arr0 = { -2,-1 }; 
	int [] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
	int [] arr2 = { 2, 4, 6, 8, 10, 12, 14, 16, 7, 6, 22, 8, 9, 16, 5, 2, 7, 8, 12, 2, 0, 14, 17, 19, 22 }; 
	
	arrIntAdrienne A1 = new arrIntAdrienne ( arr0 );
	arrIntAdrienne A2 = new arrIntAdrienne ( arr1 );
	arrIntAdrienne A3 = new arrIntAdrienne ( arr2 );
	
	testDataBuffer( A1 ); 
	testDataBuffer( A2 ); 
	testDataBuffer( A3 ); 
}
 
public static void testDataBuffer( arrIntAdrienne A)  { 
 
	A.arrDisplayAdrienne(); 
	System.out.println("Sum of Array: " + A. arrTotAdrienne());
	System.out.println("Max of Array: " + A. arrMaxAdrienne ());
	System.out.println("Min of Array: " + A. arrMinAdrienne ());
	System.out.println("Range of Array: " + A. arrRangeAdrienne ());
	System.out.println("Average value of Array: " + A.arrAverageAdrienne()); 
	
	Scanner inp = new Scanner( System.in);
	System.out.print("Enter an  integer to clip the array with: ");
	int clipVal = inp.nextInt();
	A.clipArrayAdrienne( clipVal );
	A.arrDisplayAdrienne();
	System.out.println("There are " +  A.arrFindCountAdrienne(clipVal) + " " + clipVal + "s in the given Array. ");
}
}