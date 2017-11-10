package DataTypes;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * This converts fahrenheit to Celsius
 */
public class ConvertFahrenheitToCelcius {
	public static void main(String[]args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decFormat = new DecimalFormat("0.00");
		String input;
		
		try{
			System.out.println("Please enter the temperature in fahrenheit:");
			input = br.readLine();
			float tempF = Float.parseFloat(input);
			float tempC = (tempF * 9)/5 + 32;
			System.out.println("this is the temperature in Celcius: " + decFormat.format(tempC) +"\u00b0c");
			System.out.println();
			
		}catch(Exception ex){
			System.out.println("catch the exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		try{
			System.out.println("Please enter the temperature in fahrenheit:");
			Scanner keyboard = new Scanner(System.in);
			input = keyboard.nextLine();
			float tempF = Float.parseFloat(input);
			float tempC = (tempF * 9)/5 + 32;
			System.out.println("this is the temperature in Celcius: " + decFormat.format(tempC) +"\u00b0c");
			System.out.println();
			
		}catch(Exception ex){
			System.out.println("catch the exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
