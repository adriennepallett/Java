/* Filename: HTMLProgrammer.java
 * Assignment: Assignment 11
 * Author: Adrienne Pallett
 * Version 11.1 Date April 9 2022
 * Purpose: HTML Programmer class for Assignment 11 - Print displays based on name, 
 * 	military time, and based on preferred programming language being HTML
 */
package Assign11;

public class HTMLProgrammer extends Programmer {

	public HTMLProgrammer(String nm, int tm) {
		super(nm, tm);
		// TODO Auto-generated constructor stub
	}
	
	public String welcomeGreet() {
		String welcome = "<p>";
		String msg = ": Welcome to Programming.</p>";
		
		 if (time > 6 && time < 12) 
			 welcome += "Good Morning " + name;
		 else if (time > 12 && time < 16)
			 welcome += "Good Afternoon " + name;
		 else if (time > 16 && time < 20)
			 welcome += "Good Evening " + name;
		 else
			 welcome += "Good Night " + name;
		
		return welcome + msg;	
	}
	
	public String toString() {
		String retStr = super.toString();
		retStr += welcomeGreet();
		return retStr;
	}

}
