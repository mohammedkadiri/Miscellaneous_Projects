/**
*File: Character.java
*-----------------------------
*This is a simple program which takes a character input and check's if it is a vowel,  stops after the character 'Z' is inputed and returns the amount of entries.
*
*/


import java.util.Scanner;
public class Character {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int count = 0;
		char vowels;
		
		System.out.println("Please enter a character e.g. a, f, k etc,");
		System.out.println("Enter character: ");
		
		
		while((vowels = myScanner.next(".").charAt(0) ) != 'z'){// read the input from the user for the next character
		
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
										
							default  : System.out.println("This is not a vowel");
									   break;
						
			}
			System.out.println("Please enter a character e.g. a, f, k etc,");
			System.out.println("Enter character: ");
			count++;
		}// end while(vowels == 'z')
		
		System.out.println("Well done your charcater mathes ours 'z' " + "\n There were " + count + " entry" );
	}// end of main method
}// end of class
