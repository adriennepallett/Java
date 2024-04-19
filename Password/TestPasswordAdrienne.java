/* Filename: TestPasswordAdrienne.java
 * Assignment: Assignment 10
 * Author: Adrienne Pallett
 * Version: 10.2 Date: April 4, 2023
 * Purpose: Main to read input file and based on class methods, place lines in appropriate output files
 */
package Assign10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestPasswordAdrienne extends Pssw0rdAdrienne {

	TestPasswordAdrienne(String pw) {
		super(pw);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {

		File inFile = new File ("passwdin.txt");
		if (!inFile.exists())
			System.out.println("Input file does not exist. Check the location of your file.");

		Scanner inp = new Scanner (inFile);
		
		File outfile = new File ("Adrienne_good_passwd_out.txt");
		File outfile2 = new File ("Adrienne_bad_passwd_out.txt");
		
		PrintWriter out = new PrintWriter(outfile);
		PrintWriter out2 = new PrintWriter(outfile2);
		
		while (inp.hasNext()) {
			String psw = inp.next();
			
			Pssw0rdAdrienne pW = new Pssw0rdAdrienne(psw);
			
			pW.checkPasswordAdrienne();
						
			if (pW.isValid() == true)
				out.print(psw + " - Password accepted" + pW + "\n");
			else
				out2.print("\n" + psw + " - Password is not accepted" + pW);
			
			System.out.println("Password " + psw + " read.");
			
		}
			
		inp.close();
		out.close();
		out2.close();
	}
}
