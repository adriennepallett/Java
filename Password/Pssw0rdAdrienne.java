/* Filename: Pssw0rdAdrienne.java
 * Assignment: Assignment 10
 * Author: Adrienne Pallett
 * Version: 10.2 Date: April 4, 2023
 * Purpose: Class for Password Input/Output
 */
package Assign10;

public class Pssw0rdAdrienne {

	private String pass = "";
	public boolean valid = false;
	
	Pssw0rdAdrienne (String pw) {
		pass = pw;	
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	public String checkPasswordAdrienne() {
		
		int cUpp = 0;
		int cLow = 0;
		int cDig = 0;
		int cSpc = 0;
		int cSpec = 0;
		String msg = "";
		
		for (int i = 0; i < pass.length(); i++) {
			
			char j = pass.charAt(i);
			
			if (Character.isUpperCase(j) == true)
				cUpp += 1;
			else if (Character.isLowerCase(j) == true)
				cLow += 1;
			else if (Character.isDigit(j) == true)
				cDig += 1;
			else if (Character.isWhitespace(j) == true)
				cSpc += 1;
			else
				cSpec += 1;
		}
		
		if ((pass.length() >= 9)&&(cUpp == 3)&&(cLow == 3)&&(cDig == 1)&&(cSpec > 0)&&(cSpc == 0)) {
			valid = true;
		}
		else {					
			if (pass.length() < 9)
				msg += "\n\tYour password does not contain 9 characters.";
			if (cUpp != 3)
				msg += "\n\tYour password should only contain EXACTLY 3 upper-case letters";
			if (cLow != 3)
				msg += "\n\tYour password should only contain EXACTLY 3 lower-case letters";
			if (cDig != 1)
				msg += "\n\tYour password should only contain EXACTLY 1 digit";
			if (cSpec < 1)
				msg += "\n\tYour password should contain AT LEAST 1 special character";
			if (cSpc > 0)
				msg += "\n\tYour password shouldnt contain any spaces";
		}
		return msg;
	}
		
	public String toString() {
		String retStr = "";
		retStr += checkPasswordAdrienne() + "\n";
		return retStr;
	}
}

