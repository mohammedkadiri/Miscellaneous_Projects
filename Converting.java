package DataTypes;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * 
 *ConvertFahrenheit to Celsius converts temperature in fahrenheit
 *
 */
public class Converting {
	public static void main(String[] args){
		System.out.println("This program will convert temperature in  Fahrenheit to Celcius ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		
		try{
			System.out.println("Enter temperature in Fahrenheit: ");
			input = br.readLine();
			float tempF = Float.parseFloat(input);
			float tempC = (tempF-32)*5/9;
			
			DecimalFormat decFormat = new DecimalFormat("0.00");
			System.out.println("Temperature in fahrenheit: " + decFormat.format(tempC) + "\u00b0F");
			
		}catch(Exception ex){
			System.out.println("catch Exception: " + ex.getMessage() );
			ex.printStackTrace();
		}
		System.out.println();
		
		
		try{
			System.out.println("Enter the temperature in fahrenheit: ");
			Scanner keyboard = new Scanner(System.in);
			input = keyboard.nextLine();
			float tempF = Float.parseFloat(input);
			float tempC = (tempF-32)*5/9;
			DecimalFormat decformat = new DecimalFormat("0.00");
			System.out.println("This is the temperature in fahrenheit: " + decformat.format(tempC) + "\u00b0F");
			System.out.println();
			
		}catch(Exception ex){
			System.out.println("catch the exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
