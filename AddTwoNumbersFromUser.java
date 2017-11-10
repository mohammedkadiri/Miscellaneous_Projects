package DataTypes;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * 
 * This adds two numbers from the user
 *
 */
public class AddTwoNumbersFromUser {
	public static void main(String[]args){
		System.out.println("This program accepts two inputs from the end user");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try{
			System.out.println("Enter number 1:");
			String number1 = br.readLine();
			System.out.println("Enter number 2:");
			String number2 = br.readLine();
			int num1 = Integer.parseInt(number1); 
			int num2 = Integer.parseInt(number2);
			int sum = num1 + num2;
			System.out.println("Sum = : " + sum);
		}catch(Exception ex ){
			System.out.println("caught Exception: "+ ex.getMessage());
			ex.printStackTrace();
		}
	}

}
