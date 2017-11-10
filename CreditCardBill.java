import java.util.Scanner;
public class CreditCardBill {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double monthPay = 0;
		double n = 0;
		double balance = 0;
		System.out.println("Please enter the monthly payment: ");
		monthPay = keyboard.nextDouble();
		
		for(int i = 1; i <= 11; i++){
			balance += (monthPay / 100 ) * 1.5;
			balance = 1000 - balance;
			System.out.println("Month:" + i + "balance: " + balance);
		}
	}
}
