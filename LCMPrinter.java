package loops;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class LCMPrinter {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		
		try{
			System.out.println("This program calculates the LCM of two numbers");
			System.out.println("Enter number 1: ");
			input = br.readLine();
			int num1 = Integer.parseInt(input);
			System.out.println("Enter number 2: ");
			input = br.readLine();
			int num2 = Integer.parseInt(input);
			int hcf = calculateHCF(num1, num2);
			System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
			int lcm = num1 * num2 / hcf;
			System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
		}catch(Exception ex){
			System.out.println("catch exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	public static int calculateHCF(int num1, int num2){
		int snum, lnum; // declare the small and large number
		if(num1 < num2){
			snum = num1;
			lnum = num2;
		}else{
			snum = num2;
			lnum = num1;
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
