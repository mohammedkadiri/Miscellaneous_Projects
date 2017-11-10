
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in); 
    int num = 0;
    int counter = 0;
    System.out.println("Please enter a number between (1- 1000): ");
    num = keyboard.nextInt();
    
    
    while(num < 1 || num > 1000){
        System.out.println("Please enter a number between (1- 1000): ");
        num = keyboard.nextInt();
        }
    int x;
    for(int count = 2; count <= num; count++){
    	x = 0;
    	for(int i = 1; i <= count; i++){
    		if(count % i == 0){
    			x++;
    		}
    	}
    	if(x == 2){
			System.out.println(" "+count);
		}
    }
    
    
    }
   }
