package loops;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class EvenNumberPrinter {
	public static void main(String[]args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		
		try{
			System.out.println("Enter a number of even numbers to be printed:  ");
			input = br.readLine();
			int maxevenCount = Integer.parseInt(input);
		for(int count = 1, evencount = 0; evencount < maxevenCount; count++){
			if(count % 2 == 0){
				System.out.println(count);
				evencount++;
			}
			System.out.println();
		}
			
			
		}catch(Exception ex){
			System.out.println("catch the exception: " + ex.getMessage());
			ex.printStackTrace();
			}
	}
}
