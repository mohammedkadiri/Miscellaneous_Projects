
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Dice {
	//Declare and intialize objects
	Scanner keyboard = new Scanner(System.in); 
	static Random rnd = new Random();
	static int number = 0;
	static int playerOneDices = 5;
	static int playerTwoDices = 5;
	
	//Create random generator
	static int diceOne = rnd.nextInt(6)+1;
	static int diceTwo = rnd.nextInt(6)+1;
	static int diceThree = rnd.nextInt(6)+1;
	static int diceFour = rnd.nextInt(6)+1;
	static int diceFive = rnd.nextInt(6)+1;
	
	static int [] dicePlayerOne = {1,2,3,4,5,6};
	static int [] dicePlayerTwo = {6,5,4,3,2,1};
	
	static String playerOne = "";
	static String playerTwo = "";
	static 	String check = "";
	
	public static void main(String[] args) {
	
		//Player's names and scores as well as the dices the amount of dice's 
		int playerOneScore = 0;
		int playerTwoScore = 0;
		int i = 0;
		int counter = 0;
		String no = "no";
		
		/*Greeting message and rules for the user to play*/
		System.out.println("         \tLiar's Dice");
		System.out.println(" ");
		System.out.println("\t------------     ----------------");
		System.out.println("            \tGame Rules");
		System.out.println( "");
		System.out.println("   \t Each player has five dices which will be put in a cup and then would be shaken,");
		System.out.println("\t each user must call highest amount of a certain number and they can lie about what they got,");
		System.out.println("\t if you do not believe the other player you can call out that \"it's a lie\".");
		System.out.println("\t However be aware that if counted they have amount of numbers they said or more than you will lose a dice.");
		System.out.println("\t But if they have less you make them lose a dice.");
		System.out.println(" ");
		
		//Get the name of the players
		System.out.print("Hello please enter your name PlayerOne: ");
		playerOne = returnString();
		System.out.println(" ");
		System.out.print("Hello please enter your name PlayerTwo: ");
		playerTwo = returnString();
		
		while(counter <= 20) {
		
			if(playerOneDices > 0) {
				System.out.println("");
				System.out.println(playerOne + " your die is rolling in the cup");
				System.out.print("You got");
				System.out.println(" " + dicePlayerOne[diceOne-1] + " , " + dicePlayerOne[diceTwo-1] + " , " + dicePlayerOne[diceThree-1] + " , " + dicePlayerOne[diceFour-1] + " , " + dicePlayerOne[diceFive-1] + ".");
				checkPlayerOne(check);
					System.out.println("What number did they say they have:");
					number = returnInt();
					System.out.println("Okay let's count how many numbers of " + number + "'s" + " they have.");
					if(playerOneScore < number) {
						System.out.println("Sorry you have lost one dice");
						playerOneDices--;
						dicePlayerOne(playerOneDices);
					}else {
						System.out.println("Sorry you have lost one dice" + playerTwo);
						playerTwoDices--;
						dicePlayerTwo(playerTwoDices);
					}
			}
			if(playerTwoDices > 0) {
				System.out.println("");
				System.out.println(playerTwo + " your die is rolling in the cup");
				System.out.print("You got");
				System.out.println(" " + dicePlayerTwo[diceOne-1] + " , " + dicePlayerTwo[diceTwo-1] + " , " + dicePlayerTwo[diceThree-1] + " , " + dicePlayerTwo[diceFour-1] + " , " + dicePlayerTwo[diceFive-1] + ".");
				checkPlayerTwo(check);
					System.out.println("What number did they say they have:");
					number = returnInt();
					System.out.println("Okay let's count how many numbers of " + number + "'s" + " they have.");
					if(playerOneScore < number) {
						System.out.println("Sorry you have lost one dice");
						playerOneDices--;
						dicePlayerOne(playerOneDices);
					}else {
						System.out.println("Sorry you have lost one dice" + playerTwo);
						playerTwoDices--;
						dicePlayerTwo(playerTwoDices);
					}
			}
			counter++;
		}
		
		if(playerOneDices == 0) {
			System.out.println("Sorry you have lost" + playerOne);
		}else{
			System.out.println("Congralutations you have won" + playerOne);
		}
		if(playerTwoDices == 0) {
			System.out.println("Sorry you have lost" + playerTwo);
		}else{
			System.out.println("Congralutations you have won" + playerTwo);
		}
	
	}
	
	public static String returnString() {
		Scanner keyboard = new Scanner (System.in);
		String storeString = keyboard.nextLine();
		return storeString;
	}
	
	public static int returnInt() {
		Scanner keyboard = new Scanner (System.in);
		int storeInt = keyboard.nextInt();
		return storeInt;
	}
	
	public static String checkPlayerTwo(String check){
		System.out.println("Do you agree Yes or No that " + playerOne);
		check = returnString();
		return check;
	}
	public static String checkPlayerOne(String check){
		System.out.println("Do you agree Yes or No that " + playerTwo);
		check = returnString();
		return check;
	}
	public static void dicePlayerOne(int player1) {
		if(player1 == 4) {
			System.out.println(" " + dicePlayerOne[diceOne-1] + " , " + dicePlayerOne[diceTwo-1] + " , " + dicePlayerOne[diceThree-1] + " , " + dicePlayerOne[diceFour-1] + ".");
		}
		if(player1 == 3) {
			System.out.println(" " + dicePlayerOne[diceOne-1] + " , " + dicePlayerOne[diceTwo-1] + " , " + dicePlayerOne[diceThree-1] +  ".");
		}
		if(player1 == 2) {
			System.out.println(" " + dicePlayerOne[diceOne-1] + " , " + dicePlayerOne[diceTwo-1] +  ".");
		}
		else {
			System.out.println(" " + dicePlayerOne[diceOne-1] + ".");
		}
	}
	
	public static void dicePlayerTwo(int player2) {
		if(player2 == 4) {
			System.out.println(" " + dicePlayerOne[diceOne-1] + " , " + dicePlayerOne[diceTwo-1] + " , " + dicePlayerOne[diceThree-1] + " , " + dicePlayerOne[diceFour-1] + ".");
		}
		if(player2 == 3) {
			System.out.println(" " + dicePlayerOne[diceOne-1] + " , " + dicePlayerOne[diceTwo-1] + " , " + dicePlayerOne[diceThree-1] +  ".");
		}
		if(player2 == 2) {
			System.out.println(" " + dicePlayerOne[diceOne-1] + " , " + dicePlayerOne[diceTwo-1] +  ".");
		}
		else {
			System.out.println(" " + dicePlayerOne[diceOne-1] + ".");
		}
	}
}
