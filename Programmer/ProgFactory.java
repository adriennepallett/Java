/* Filename: ProgFactory.java
 * Assignment: Assignment 11
 * Author: Adrienne Pallett
 * Version 11.2 Date April 11 2022
 * Purpose: Subclass for Assignment 11 - Establishes a third input into the Programmer class
 * 		when the programmers preferred language is entered into the constructor
 */

package Assign11;

import java.util.*;

public class ProgFactory extends Programmer {

	ProgFactory(String nm, int tm, String lang) {
		super(nm, tm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Programmer> progList = new ArrayList<Programmer>();

		progList.add(new Programmer("Mary", 8));
		progList.add(new PythonProgrammer("John", 13));
		progList.add(new JavaProgrammer("Heidi", 21));
		progList.add(new HTMLProgrammer("Jean", 18));

		progList.add(new ProgFactory("Mary", 8, "CSS"));
		progList.add(new ProgFactory("John", 13, "Python"));
		progList.add(new ProgFactory("Heidi", 21, "Java"));
		progList.add(new ProgFactory("Jean", 18, "HTML"));

		//Welcome Sequence
		for (int i = 0; i < progList.size(); i++) {
			Programmer prog = progList.get(i);
			System.out.println(" " + prog.welcomeGreet());
		}
	}

		public static Programmer getProgInstance(String nm,int tm,String lang){
			return switch (lang) {
				case ("Python") -> new PythonProgrammer(nm, tm);
				case ("Java") -> new JavaProgrammer(nm, tm);
				case ("HTML") -> new HTMLProgrammer(nm, tm);
				default -> new Programmer(nm, tm);
			};
		}
	}



