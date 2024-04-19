/* Filename: Programmer.java
 * Assignment: Assignment 11
 * Author: Adrienne Pallett
 * Version 11.1 Date April 9 2022
 * Purpose: Superclass for Assignment 11 - Print displays based on name, 
 * 	military time, and based on preferred programming language
 */

package Assign11;

public class Programmer {

	protected String name;
	protected String greeting;
	protected int time;
	
	Programmer (String nm, int tm) {
		name = nm;
		time = tm;
	}

	public String getName() {
		return name;
	}

	public String getGreeting() {
		return greeting;
	}

	public int getTime() {
		return time;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public String welcomeGreet() {
		String welcome = "";
		String msg = ": Welcome to Programming.";
		
		 if (time > 6 && time < 12) 
			 welcome = "Good Morning " + name;
		 else if (time > 12 && time < 16)
			 welcome = "Good Afternoon " + name;
		 else if (time > 16 && time < 20)
			 welcome = "Good Evening " + name;
		 else
			 welcome = "Good Night " + name;
		
		return welcome + msg;	
	}
	
	public String toString () {
		String retStr = "";
		retStr += welcomeGreet();
		return retStr;
		
	}
	
	
}
