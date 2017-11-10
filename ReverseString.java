
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author TyCy
 * 
 * This program will ask the user to input a sentence followed by full stop
 * Then will ask the user to input a number between 1 and the maximum ammount of words from sentence .
 * Let's say your sentence has 5 words the program will ask you to input a  number between 1 and 5.
 */
public class ReverseString {

	public static void main(String[] args) {
	Scanner key = new Scanner(System.in);
	
	System.out.println("Please input a sentence followed by full stop");
	String sentence = key.nextLine();
	
	String word = "";
	int counter = 0;	
	int arraycount = 0;
    int countSpace = 0;
        
        //check if your sentence has .(full stop) at the end.
        while(sentence.charAt(sentence.length()-1) != '.'){
        System.out.println("Error ! Please input your sentence followed by full stop");
	    sentence = key.nextLine();
        }
        
        
        //count the spaces
        for(int i = 0; i < sentence.length(); i++){
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
	
        
	counter++; //keep increment this because need to start the second word from next position , otherwise will start from space
	arraycount++; //this is to track the position into array of any word.
    
	}while(sentence.charAt(counter-1) != '.'); // do while loop which run till the last point of sentence (.) full stop
    
            System.out.println("Please input a number between 1 and " + (countSpace+1));
            int pickWord = key.nextInt()-1;
            
         //while loop to check if the user input the right number when he pick the word
            while(pickWord < 0 || pickWord >= (countSpace+1)){
                System.out.println("Error ! Please input a number between 1 and " + (countSpace+1));
                pickWord = key.nextInt()-1;
            }
    
    String reverseWord = ""; //string variable to store the reversed word
    
    //for loop to reserve the desire word
    for(int j = words[pickWord].length()-1; j >= 0 ; j--){
        reverseWord += words[pickWord].charAt(j);  // words return a string , that's why i can call charAt method to get any letter from that word
        /**
         * J is equal with the length of the picked word
         * then the for loop start from the end to 0 and add the letters to reverseWord variable
         * Because words is an array of strings , any element from it is a string so i can call the charAt method
         */
    }
     words[pickWord] = reverseWord; //replace the normal word with the reverse one
     
              //for each loop to display the sentence.
            for (String word1 : words) {
                System.out.print(word1+" ");
            }       
            System.out.println();
            System.out.println("End of program !");
}
	
}