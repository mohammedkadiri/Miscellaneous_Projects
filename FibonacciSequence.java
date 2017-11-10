package ArraysandStrings;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class FibonacciSequence {
	public static void main(String[]args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		
		try{
			System.out.println("This is the fibonacci sequence program. ");
			System.out.println("Enter the number of elements: ");
			input = br.readLine();
			int maxCount = Integer.parseInt(input);
		
			maxCount = maxCount > 2 ? maxCount : 2;
			int[] fibonacciSequence = new int[maxCount];
			fibonacciSequence[ 0 ] = 0;
			fibonacciSequence[ 1 ] = 1;
			
			for(int count = 2; count < maxCount; count++){
				fibonacciSequence[ count ] = fibonacciSequence[ count -1 ] + fibonacciSequence[count -2];
			}
			System.out.println("Fibonacci Sequence");
			displayRow(fibonacciSequence);
			
		}catch(Exception ex){
			System.out.println("catch exception " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	public static void displayRow(int[] row){
		for(int num : row){
			System.out.print(num + " ");
		}
		System.out.println( "" );
	}
}
