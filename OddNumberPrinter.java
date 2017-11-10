package loops;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class OddNumberPrinter {
	public static void main(String [] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try{
			System.out.println("Enter a number of odd numbers to be printed");
			input = br.readLine();
			int countmaxOdd = Integer.parseInt(input);
			for(int count = 1, oddCount = 0; oddCount < countmaxOdd; count++){
				if(count % 2 != 0){
					System.out.println(count);
					oddCount++;
				}
			}
		}catch(Exception ex){
			System.out.println("catch the exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
