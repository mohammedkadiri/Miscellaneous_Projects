import java.util.Scanner;
public class Power {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double limit = 1;// limit intialized to 1
		double x = 0;
		double temp =0;
		int n = 0;
		System.out.println("Enter X: ");
		x = keyboard.nextDouble();
		System.out.println("Enter N: ");
		n = keyboard.nextInt();
		
		while(n < 0){// while the user's enters a negative number  should continuosly loop back until the user enters a positive number
			System.out.println("Please enter a positive interger: ");
			n = keyboard.nextInt();
		}
	
		for(int i = 0; i < n; i++){
			x *= temp;
			temp = x;
			x = 2;
		}
		System.out.println(temp);
	}
}
