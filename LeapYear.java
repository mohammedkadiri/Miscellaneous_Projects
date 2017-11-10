package ConditionalOperators;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/*
 * A simple program to check whether the year is a Leap Year
 */

public class LeapYear {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		
		try{
			System.out.println("Enter Year: ");
			input = br.readLine();
			int year = Integer.parseInt(input);
			
			if(year % 4 == 0 && year % 100 != 0){
				System.out.println(year + " is a leap year");
			}else if(year % 400 == 0){
				System.out.println(year + " is a leap year");
			}else{
				System.out.println(year + " This is not a leap year");
			}
		}catch(Exception ex){
			System.out.println("catch the exception: " + ex.getMessage());
			ex.printStackTrace();;
		}
	}
}
