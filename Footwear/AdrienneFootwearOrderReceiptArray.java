/* Filename: AdrienneFootwearOrderReceiptArray.java
 * Assignment: Assignment 7
 * Author: Adrienne Pallett
 * Version: 7.1 Date March 10, 2023
 * Purpose: Using an array, duplicate AdrienneFootwearOrderReceipt.java so that both programs display the same print out with Footwear class
 */
package Assign7;

public class AdrienneFootwearOrderReceiptArray extends Footwear {

	public static void main(String[] args) {
		double dTotalPrice = 0.0;
		int iTotalWeight = 0;
		
		// Footwear objects created
		Footwear footwear1 = new Footwear("Nike", 10, "Mens wear Yellow", 11, 59.99);        
		Footwear footwear2 = new Footwear( "Addidas", 7, "Womens wear Black", 8, 39.99);      
		Footwear footwear3 = new Footwear("New Balance", 11, "Boys Basketball White", 10, 79.59);      
		Footwear footwear4 = new Footwear("Vans", 10, "Girls Floral", 7, 21.39); 
		Footwear footwear5 = new Footwear( "Kirkland", 5, "Child wear Brown", 4, 19.99); 
		
		// Footwear object quantities changed
		footwear4.setQuantity(3);
		footwear5.setQuantity(2);

		// Put Footwear objects in an array
		Object[] footwearArray = {footwear1,footwear2,footwear3,footwear4,footwear5};
		
		//Use Array to generate same output as OrderReceiptMain
		System.out.println("Here are your shopping cart contents.");         
		System.out.println(footwearArray[0]);
		System.out.println(footwearArray[1]);
		System.out.println(footwearArray[2]);
		System.out.println(footwearArray[3]);
		System.out.println(footwearArray[4]);
		
		// Total Order Price
		dTotalPrice += footwear1.getOrderPrice();         
		dTotalPrice += footwear2.getOrderPrice();         
		dTotalPrice += footwear3.getOrderPrice();         
		dTotalPrice += footwear4.getOrderPrice(); 
		dTotalPrice += footwear5.getOrderPrice();
		
		// Total Order Weight
		iTotalWeight += footwear1.getOrderWeightInOunces();        
		iTotalWeight += footwear2.getOrderWeightInOunces();         
		iTotalWeight += footwear3.getOrderWeightInOunces();         
		iTotalWeight += footwear4.getOrderWeightInOunces();   
		iTotalWeight += footwear5.getOrderWeightInOunces();
		
		// Order Details    
		System.out.println("The Price of your order is $" + dTotalPrice);         
		System.out.println("The shipping weight is " + iTotalWeight / 16  + " pounds " + iTotalWeight %16 + " ounces");
		
	}

}
