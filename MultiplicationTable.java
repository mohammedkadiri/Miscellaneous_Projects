package loops;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
 * 
 * This creates a simple multiplication table
 *
 */
public class MultiplicationTable {
	public static void main(String [] args){
		// print Multiplication table of a given number
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		
		try{
			System.out.println("Enter number for which to be multiplied");
			input = br.readLine();
			int num = Integer.parseInt(input);
			System.out.println("multiplication table for number " + num);
			for(int count = 1; count <= 10; count++){
				System.out.println(num + " * " + count + " = " + num * count);
			}
		}catch(Exception ex){
			System.out.println("catch the exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
