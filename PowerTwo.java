import java.util.*;

public class PowerTwo {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0;
		int power = 2;
		System.out.println("Enter number: ");
		num = key.nextInt();
		
		System.out.println("Is the number a power of two " + isPowerOfTwo(num, power) );
	}
	
	public static boolean isPowerOfTwo(int b,  int a) {
		boolean isPowerOfTwo = true;
		double num1 = Math.log(b)/Math.log(a); // Find the natural logs and then divide the number you are checking by the power of 2
		double num2 = Math.ceil(num1); // Returns the smallest floating-point value of num1
		
		if((num1/num2) == 1){
		    return isPowerOfTwo;
		}else{
		    return !isPowerOfTwo;
		 }
	}
}
