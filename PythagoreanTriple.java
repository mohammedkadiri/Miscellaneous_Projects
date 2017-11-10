package ConditionalOperators;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
/*
 * This is a simple program which checks if the the sqaured sum of two sides is equal to the squared of the other side
 */
public class PythagoreanTriple {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String num1;
		String num2;
		String num3;
		
		try{
			System.out.println("Please enter your first number: ");
			num1 = br.readLine();
			System.out.println("Please enter your second number: ");
			num2 = br.readLine();
			System.out.println("Please enter your third number: ");
			num3 = br.readLine();
			int number1 = Integer.parseInt(num1);
			int number2 = Integer.parseInt(num2);
			int number3 = Integer.parseInt(num3);
			
			int num1Squared = number1 * number1;
			int num2Squared = number2 * number2;
			int num3Squared = number3 * number3;
			
			if(num1Squared + num2Squared == num3Squared){
				System.out.println("Entered intergers: " + "num 1 = " + number1 + " num 2 = " + number2 + " num 3 = " + num3 );
				System.out.println(num1Squared + " + " + num2Squared + " = " + num3Squared );
				System.out.println("This is a Pythagorean Triple");
			}else{
				System.out.println("Entered intergers: " + "num 1 = " + number1 + " num 2 = " + number2 + " num 3 = " + num3 );
				System.out.println(num1Squared + " + " + num2Squared + " = " + num3Squared );
				System.out.println("This is not a Pythagorean Triple");
			}
		}catch(Exception ex){
			System.out.println("catch the exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
