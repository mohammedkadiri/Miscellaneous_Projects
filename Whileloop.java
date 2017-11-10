import java.util.Scanner;
public class Whileloop {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		float user = 1;
		int counter = 0;
		float totalValue = 0;
		System.out.println("");
		while(user != 0){
			System.out.println("Please enter each item which you have bought and enter (0) to declare you have finished:  ");
			user = sc.nextInt();
			totalValue += user;
			counter++;
		}
		System.out.println("Adding up a Bill");
		System.out.println("Total value: " + (float)totalValue);
		System.out.println("item count: " + --counter);
	}
}
