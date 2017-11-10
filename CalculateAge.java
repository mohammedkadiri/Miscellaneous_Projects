package ConditionalOperators;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.time.LocalDate;
import java.time.Period;
/*
 * This is a simple program which calculates the users age
 */
public class CalculateAge {
	public static void main(String[] args){
		System.out.println("This program accepts date of birth and calculates age.");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try{
			System.out.println("Enter Your Year of Birth(> 1900 four digits) : ");
			input = br.readLine();
			int year = Integer.parseInt(input);
			System.out.println("Enter Your Month(1-12) : ");
			input = br.readLine();
			int month = Integer.parseInt(input);
			System.out.println("Enter Your Day of Birth(1-31): ");
			input = br.readLine();
			int day = Integer.parseInt(input);
			
			System.out.println("(dd-mm-yyyy): " + day + "-" + month + "-" + year);
			LocalDate today = LocalDate.now();
			LocalDate birthday = LocalDate.of(year, month, day);
			Period period = Period.between(birthday, today);
			System.out.println("Age:- " + period.getYears() + " years " + period.getMonths() + " month " + period.getDays() + " days");
		}catch(Exception ex){
			System.out.println("catch the exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
