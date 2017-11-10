import java.util.*;
import java.util.Arrays;

public class Program {
	public static void main(String[] args){
		String s = spacesInWords();// I stored the return method inside  the String s
		String [] seperatedWords = new String [] {s};// I stored the results inside the a String class array cause i am not sure if arrays allow methods
		System.out.println(Arrays.toString(seperatedWords));
	}
	public static String spacesInWords() {// I created a method called spacesInWords which will pass the method on after executing some of the commands
		Scanner in = new Scanner(System.in);// Create the Scanner object
		System.out.print("Please enter a sentence: ");// Ask the user for a sentence input
		String eachWord = in.nextLine();
		System.out.print("Please enter a number: ");// Ask the user for a number input
		int n = in.nextInt();
		System.out.println("User entered sentence and number: " + eachWord + "," + n);// Display the User's entered sentence and a number
		
		String spacesInWords;// Declare the String Words
		String a = "a"; // Declare and initialise the String
		
			for(int i = eachWord.length(); i > 0; i--){//initialise the loop with the length of the string and store in Interger i and when i has come to the end of the length the condition has been meet , also decrement from the length each time
				a += eachWord.charAt(i - 1);// concatenates the value of eachWord's length and subtracts one away in order to decrease the length and avoid out of bounds exception
			}
		spacesInWords = a;// store the value of of the reversed words
		return spacesInWords;// return the method
	}// end of the main method execution
	
}// end of class 

