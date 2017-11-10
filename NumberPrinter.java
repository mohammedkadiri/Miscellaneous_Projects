package loops;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
 * 
 *A simple program that prints out to the number the user entered
 *
 */
public class NumberPrinter {
	public static void main(String[] args){
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String input;
	
	try{
		System.out.println("Enter a number to be printed");
		input = br.readLine();
		int maxNum = Integer.parseInt(input);
		
		for(int count = 1; count <= maxNum; count++){
			System.out.println(count);
		}
		
	}catch(Exception ex){
		System.out.println("Catch the exception: " + ex.getMessage());
		ex.printStackTrace();
		}
	}
}
