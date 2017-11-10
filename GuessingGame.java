
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		
		int generatedNumber = rnd.nextInt();
		System.out.println("Welcome to this guessing game can you guess the number ?");
	}
}
