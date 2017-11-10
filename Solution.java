import java.util.*;

public class Solution {

	public static void main(String[] args){

		String s = reverse();
		System.out.println(s);
	}

	public static String reverse() {


		Scanner key = new Scanner(System.in);

		System.out.println("Please input a sentence");
		String sentence = key.nextLine() + " .";

		String word = "";
		int counter = 0;    
		int arraycount = 0;
		int countSpace = 0;

		//check if your sentence has .(full stop) at the end.
		while(sentence.charAt(sentence.length()-1) != '.'){
			System.out.println("Error: Please input your sentence followed by full stop");
			sentence = key.nextLine() + " .";
		}


		//count the spaces
		for(int i = 0 ; i < sentence.length();i++){
			if(sentence.charAt(i) == ' '){
				countSpace++;
			}
		}

		String[] words = new String[countSpace+1]; // here it is countSpace+1 because always the spaces are less with one unit then the words from a sentence

		do{
			//while loop to get each word separated 
			while((sentence.charAt(counter) != ' ') && (sentence.charAt(counter) != '.')){ //check if the character from the specific position is space or . , if is not put that into the word variable
				word += sentence.charAt(counter);
				counter++;
			} //this while loop will stop when it reach the first space.

			words[arraycount] = word;
			word = "";

			counter++; //keep increment this because need to start the secod word from next position , otherwise will start from space
			arraycount++; //this is to track the position into array of any word.

		}

		while(sentence.charAt(counter-1) != '.'); // do while loop which run till the last point of sentence (.) full stop
			System.out.println("Please input a number between 1 and " + (countSpace+1));
			int pickWord = key.nextInt()-1;
		
		//while loop to check if the user input the right number when he pick the word
		while(pickWord < 0 || pickWord >= (countSpace+1)){
			System.out.println("Error ! Please input a number between 1 and " + (countSpace+1));
			pickWord = key.nextInt()-1;
		}
		
		int count = 0;

		while(pickWord < countSpace)
		{

			String reverseWord = ""; //string variable to store the reversed word
			


			//for loop to reverse the desire word

			for(int i = words[pickWord].length()-1; i >= 0 ; i--){
				reverseWord += words[pickWord].charAt(i);  // words return a string , that's why i can call charAt method to get any letter from that word

				/**
				 * i is equal with the length of the picked word
				 * then the for loop start from the end to 0 and add the letters to reverseWord variable
				 * Because words is an array of strings , any element from it is a string so i can call the charAt method
				 */
			}

			words[pickWord] = reverseWord; //replace the normal word with the reverse one
			pickWord += 2;
			count++;

			
		}

		String oldWord = words[pickWord];
		
		if (oldWord.equalsIgnoreCase(words[pickWord])){
						System.out.println(oldWord + " is a palindrome");
					}

		for(String s : words)
		{
			System.out.print(s + " ");
		}

		System.out.println();
		
		return "";
	}

}