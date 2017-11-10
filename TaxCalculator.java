import java.util.Scanner;
import java.text.DecimalFormat;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		DecimalFormat dft = new DecimalFormat("0.00");
		System.out.println("Please enter your annual salary £: ");
		double salary = key.nextDouble();
		System.out.println("Please enter your annual tax rate %");
		double taxRate = key.nextDouble();
		double annualTax = (salary * (taxRate/100));	
		System.out.println("The annual tax payable is: " + dft.format(annualTax));
		double monthlyTax = 0;
		
		for(int i = 1; i <= 12; i++) {
			monthlyTax += (salary * (taxRate/100))/12;
			System.out.println("Total paid in month " + i + " is £ " +  dft.format(monthlyTax));
		}
	}
}
