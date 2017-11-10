import java.util.*;

public class Primes {
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int num = 0;
		System.out.println("Please enter a number to find all the prime numbers: ");
		num = keyboard.nextInt();
		
		isPrime(num);
	}
	
	public static void isPrime(int a){
		
		
		//Loop each number until it reaches the end
		for(int i = 2; i <= a; i++){
		
			boolean flag = true; // Create flag variable and set it to false
			for(int j = 2; j < i; j++){// Start the loop from two as its the first prime then divide by 2
				
				if(i % j == 0){// If i is divisible by any other number other than itself and one then it's not a prime number
					flag = false;
				}
			}
			if(flag == true){
				System.out.print(i + " "); //Print it as it's a prime number
			}
		}
		
	
	}
}
