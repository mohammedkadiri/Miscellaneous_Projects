package ConditionalOperators;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/*
 * This is a simple program which finds the month 
 */

public class MonthFinder {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		
		try{
			System.out.println("Please enter a number to find your month(1-12): ");
			input = br.readLine();
			int num = Integer.parseInt(input);
			
			switch(num){
			case  1 : System.out.println("Month: " + input + " January");
					   break;
			case  2 : System.out.println("Month: "  + input + " February");
					   break;
			case  3 : System.out.println("Month: " + input + " March ");
					   break;
			case  4 : System.out.println("Month: " + input + " April ");
			   		   break;
			case  5 : System.out.println("Month: " + input + " May ");
					   break;
			case  6 : System.out.println("Month: " + input + " June ");
			   		   break;
			case  7 : System.out.println("Month: " + input + " July ");
			   		   break;
			case  8 : System.out.println("Month: " + input + " August ");
	   		           break;
			case  9 : System.out.println("Month: " + input + " September ");
	   		   		   break;
			case  10 : System.out.println("Month: " + input + " October ");
	   		   		   break;
			case  11 : System.out.println("Month: " + input + " November ");
					   break;
			case  12 : System.out.println("Month: " + input + " December ");
					   break;
			default : System.out.println("Please enter a num between(1-12) to find your month");
					 break;
			}
			
		}catch(Exception ex){
			System.out.println("catch the exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
