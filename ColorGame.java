import java.util.Scanner;
import java.util.Random;

public class ColorGame {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int user = 0;
		Random rnd = new Random();
		String[] colors = {"BLUE", "GREEN", "PINK", "PURPLE"};
		int num = rnd.nextInt(4)+1;
		boolean val = true;
		
		System.out.println(">>> Hello. Let's play a game.");
		System.out.println(">>> Guess my favourite colour. Select a number as follows...");
		System.out.println("Select 1 for BLUE");
		System.out.println("Select 2 for GREEN");
		System.out.println("Select 3 for PINK");
		System.out.println("Select 4 for PURPLE");
		
		
		do{
			
			System.out.println("What is your guess 1-4?");
			user = keyboard.nextInt();
			
			if(user == num) {
				System.out.println("Congrats, you got it!");
				System.out.println("Well done. You guessed my favourite colour , it was " + colors[num-1]);
				val = false;
			}
			if(user > 4) {
				System.out.println(">>> Between 1-4 only");
			}
			if(user != num) {
				System.out.println("Nope. Thats not my favourite color");
			}
			
		}while(val);
	}
}
