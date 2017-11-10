package loops;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/** 
 * A simple program which checks prime numbers 
 * 
 */
public class PrimeChecker {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		
		try{
			System.out.println("Enter a number to check all the prime numbers: ");
			input = br.readLine();
			int number = Integer.parseInt(input);
			
			if(number == 2){
				System.out.println(number + " is a prime number ");
			}
			else if(number % 2 == 0){
				System.out.println(number + " is not a prime number ");
			}
			else{
				int maxCount = (int)Math.ceil(Math.sqrt(number));
				boolean isPrime = true;
				for(int count = 3; count <= maxCount; count = count + 2){
					if(number % count == 0){
						isPrime = false;
						break;
					}
				}
			if( isPrime ){
				System.out.println(number + "  is a prime number ");
			}else{
				System.out.println(number + " is not a prime number ");
			}
			
			}
			}catch(Exception ex){
			System.out.println("catch exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}

