import java.util.Scanner;

public class Adding {
	public static void main(String[] args){
		Scanner keyboard = new Scanner (System.in);
		double sum = 1.0;
		int limit = 0;
		int count = 1;
		System.out.println("Please enter the amount of numbers which you will add: ");
		limit = keyboard.nextInt();
		
		while(count <= limit){
			sum += (sum/count++);
			count++;
		}
		System.out.println("The sum is " + sum);
	}
}
