package loops;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class PrimeNumberPrinter {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		
		try{
			System.out.println("This program prints prime numbers ");
			System.out.println("Enter number of prime numbers to be printed ");
			input = br.readLine();
			int maxprimeCount = Integer.parseInt(input);
			System.out.println("Prime numbers: " );
			for(int count = 2, primeCount = 0; primeCount < maxprimeCount; count++){
				if(checkPrime(count)){
					System.out.println(count);
					primeCount++;
				}
			}
		}catch(Exception ex){
			System.out.println("catch the exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
 
 private static boolean checkPrime(int number){
	 boolean isPrime = true;
	 if(number == 2 ){
		 isPrime = true;
	 }else if(number % 2 == 0){
		 isPrime = false;
	 }else{
		 int maxCount = (int)Math.ceil(Math.sqrt(number));
		 for(int count = 3; count < maxCount; count = count + 2){
			 if(number % count == 0){
				 isPrime = false;
				 break;
			 }else{
				 isPrime = true;
			 }
		 }
	
	}
	 return isPrime;
 }
}
