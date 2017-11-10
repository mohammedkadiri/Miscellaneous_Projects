/**
 * File: SwitchOne.java
 * ----------------------------
 * A simple program to check if the letter inputed is a vowel
 */

import java.util.Scanner;

public class SwitchOne {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		
		
		System.out.println("Please enter a letter: ");
		char vowels = myScanner.next().charAt(0);// takes the first character from the input 'charAt(0)'
		
		switch(vowels){
						case 'a' : System.out.println("This is a vowel");
								   break;
						case 'e' : System.out.println("This is a vowel");
						           break;
						case 'i' : System.out.println("This is a vowel");
						           break;
						case 'o' : System.out.println("This is a vowel");
						           break;
						case 'u' : System.out.println("This is a vowel");
						           break;
						default :  System.out.println("This is not a vowel");
						           break;
		}
		
	}
}
