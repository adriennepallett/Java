/* Filename: arrIntAdrienne.java
 * Assignment: Assignment 6
 * Author: Adrienne Pallett
 * Version: 6.1 Date: February 25 2023
 * Purpose: Manipulate an array of functions using classes
 */
package Assign6;

public class arrIntAdrienne {

		// Attributes
		private int[] arr;
		
		// Non Argument Constructor
		arrIntAdrienne() {
			arr = new int[10];
		}
		
		// Argument Constructor
		arrIntAdrienne(int length) {
			arr = new int[length];
		}
		arrIntAdrienne(int[] arr) {
			this.arr = arr;
		}
		
		// Get/Set
		public int[] getArr() {
			return arr;
		}
		public void setArr(int[] arr) {
			this.arr = arr;
		}
		
		// Methods
		public void arrDisplayAdrienne() {
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
		}
		public int arrTotAdrienne() {
			int sumArr = 0;
			for (int i = 0; i < arr.length; i++) {
				sumArr += arr[i];
			}
			return sumArr;
		}
		public int arrMaxAdrienne() {
			int maxArr = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > maxArr) 
					maxArr = arr[i];
				}
			if (arr.length == 0) 
				maxArr = 0;
			return maxArr;
		}
		public int arrMinAdrienne() {
			int minArr = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < minArr) minArr = arr[i];
				else {
					if (arr.length == 0) {
						minArr = 0;
					}
				}
			}
			return minArr;
		}
		public int arrRangeAdrienne() {
			int rangeArr = arrMaxAdrienne() - arrMinAdrienne();
			return rangeArr;
		}
		public double arrAverageAdrienne() {
			double avgArr = (double)arrTotAdrienne()/arr.length;
			return avgArr;
		}
		public int[] clipArrayAdrienne(int clipVal) {
			int arrClip[] = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= clipVal) {
					arr[i] = clipVal;
				}
				arrClip[i] = arr[i];			
			}
			return arrClip;
		}
		public int arrFindCountAdrienne(int clipVal) {
			int found = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == clipVal) 
					found += 1;
			}
			return found;
		}
}
