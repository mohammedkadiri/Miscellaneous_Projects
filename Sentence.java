import java.util.Scanner;

public class Sentence {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String sentence;
		int vowelcount = 0;
		System.out.println("Please enter a sentence: ");
		sentence = keyboard.nextLine();// Gets the user sentence 
		while(sentence.charAt(sentence.length()-1) != '.'){// while the sentence doesn't end with a full stop execute this
			System.out.println("Please enter a sentence with a full stop at the end: ");
			sentence = keyboard.nextLine();
		}
		System.out.println("thank you for entering a sentence");
		
		String x = sentence;
		for(int i = 0; i < x.length()-1; i++){// for loop to iterate over the sentence
			switch(x.charAt(i)){// switch statement to check if the sentence contains a vowel 
			case 'a': vowelcount++;
			break;
			case 'A': vowelcount++;
			break;
			case 'e': vowelcount++;
			break;
			case 'E': vowelcount++;
			break;
			case 'i': vowelcount++;
			break;
			case 'I': vowelcount++;
			break;
			case 'o': vowelcount++;
			break;
			case 'O': vowelcount++;
			break;
			case 'u': vowelcount++;
			break;
			case 'U': vowelcount++;
			break;
			}
		}
		System.out.println("This sentence contains " + vowelcount);// prints to the screen the number of vowels in the sentence
	}
}
