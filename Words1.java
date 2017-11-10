import java.util.*;

public class Words1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		char [] l = new char[100000000]; // l = letter, Char array to save letters in a list.
		char [] i = new char[100000000]; // The reverse array?
		System.out.println("Please enter your senetence: "); // Tells the user to enter a sentence
		String s = in.nextLine();// Takes in users next Line 
		String [] words = s.split(" ");
			int len = s.length();// Counts the amount of letters are i the sentence.
			System.out.println(len);// Prints out the string
			int spaces = 0;// int the amount of spaces?
			int num2 = 0;// number 2 interger
			System.out.println("Please enter a interger");// Instructions for interger
			int n = in.nextInt();// takes in user input (Integer)
				for(int num = 0; num < len; num++){// Save an variable, condition and increase the variable
				l[num] = s.charAt(num);// places character into char array
				System.out.print(l[num] );
				if(s.charAt(num) == ' '){// Save the amount of spaces
					spaces++;
				}
			}
				for(int numl = s.length()-1; numl >= 0; numl--){// This reverses the whole sentence 
					i[num2] = s.charAt(numl);
					System.out.print(i [num2]);
					num2++;
				}
				System.out.println(spaces);
	}
}
