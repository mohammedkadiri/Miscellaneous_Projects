import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		int num = 0;
		long factorial =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 20: ");
		boolean isValid = false;
		do{
			num = sc.nextInt();
			if(num < 1 || num > 20){
				System.out.println("enter a number between 1 and 2");
			}else{
				isValid = true;
			}
		}while(!isValid);
		for(int num2 = num; num2 >= 1; num2--){
			factorial = factorial * num2;
		}
		System.out.println(num + " is factorial " + factorial);
	}
}
