import java.util.Scanner;

public class Practice {
	public static void main(String[]args){
		int num1 = 0, num2 =0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This is HCF of two numbers ");
		System.out.println("Enter num1");
		num1 = keyboard.nextInt();
		System.out.println("Enter number2");
		num2 = keyboard.nextInt();
		int hcf = calculateHCF(num1, num2);
		System.out.println("highest commom factor: " + num1 + " and " + num2 + " is " + hcf);
		
	}
	public static int calculateHCF(int number1, int number2){
		int lnum = 0, snum = 0;
		if(number1 < number2){
			snum = number1;
			lnum = number2;
		}else{
			lnum = number1;
			snum = number2;
		}
		while(lnum % snum != 0){
			int tempNum = lnum % snum;
			snum = lnum;
			lnum = tempNum;
		}
		int hcf = lnum;
		return hcf;
	}
}
