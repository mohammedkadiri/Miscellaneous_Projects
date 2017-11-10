import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		// output the prompt
		System.out.println("Enter a value: ");
		
		//wait for the user to enter something
		double value = input.nextDouble();
		
		//tell them what they entered
		System.out.println("You entered: " + value);
	}
}

