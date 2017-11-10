import java.util.Scanner;

public class deviation {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in); 
		double num = 0;
		int count = 0;
		int limit = 0;
		double avg;
		double avgSquared;
		double avgSquare = 0;
		double sd;
		System.out.println("Please enter the amount of numbers");
		limit = keyboard.nextInt();
		while(count < limit){
			System.out.println("Please enter the numbers: ");
			num = keyboard.nextDouble();
			avgSquare += num * num;
			num += num;
			count++;
		}
		System.out.println(num);
		avg = num / 4;
		avgSquared = avg * avg;
		avgSquare = avgSquare / 4;
		sd = Math.sqrt(avgSquare - avgSquared);
		System.out.println(avgSquared);
		System.out.println(avgSquare);
		System.out.println("This is the standard deviation: " + sd);
	}
}
