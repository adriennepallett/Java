/* Filename: AdrienneFootwearOrderReceipt.java
 * Assignment: Assignment 7
 * Author: Adrienne Pallett
 * Version: 7.1 Date: March 10, 2023
 * Purpose: Professor provided main for displaying a footwear order
 */

package Assign7;

public class AdrienneFootwearOrderReceipt extends Footwear {

	public static void main(String[] args) {      
		double dTotalPrice = 0.0;         
		int iTotalWeight = 0;  
		
		// Put the 4 footwears being ordered in footwear1 through footwear 4         
		Footwear footwear1 = new Footwear("Nike", 10, "Mens wear Yellow", 11, 59.99);        
		Footwear footwear2 = new Footwear( "Addidas", 7, "Womens wear Black", 8, 39.99);      
		Footwear footwear3 = new Footwear("New Balance", 11, "Boys Basketball White", 10, 79.59);      
		Footwear footwear4 = new Footwear("Vans", 10, "Girls Floral", 7, 21.39); 
		Footwear footwear5 = new Footwear( "Kirkland", 5, "Child wear Brown", 4, 19.99);  
		    
		footwear4.setQuantity(3);
		footwear5.setQuantity(2);
		
		// Show the details of the order using show()         
		System.out.println("Here are your shopping cart contents.");         
		System.out.println(footwear1);
		System.out.println(footwear2);
		System.out.println(footwear3);
		System.out.println(footwear4);
		System.out.println(footwear5);
		
		// Compute the total Price and total weight in this section        
		dTotalPrice += footwear1.getOrderPrice();         
		dTotalPrice += footwear2.getOrderPrice();         
		dTotalPrice += footwear3.getOrderPrice();         
		dTotalPrice += footwear4.getOrderPrice(); 
		dTotalPrice += footwear5.getOrderPrice();
		
		iTotalWeight += footwear1.getOrderWeightInOunces();        
		iTotalWeight += footwear2.getOrderWeightInOunces();         
		iTotalWeight += footwear3.getOrderWeightInOunces();         
		iTotalWeight += footwear4.getOrderWeightInOunces();   
		iTotalWeight += footwear5.getOrderWeightInOunces();
		
		// Here we show the order details        
		System.out.println("The Price of your order is $" + dTotalPrice);         
		System.out.println("The shipping weight is " + iTotalWeight / 16  + " pounds " + iTotalWeight %16 + " ounces");

	}

}
