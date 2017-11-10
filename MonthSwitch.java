import java.util.Scanner;

public class MonthSwitch {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		String month;
		String day;
		int days = 0;
		System.out.println("Please enter your month: ");
		month = myScanner.nextLine();
		
		switch(month){
		case "september" : System.out.println("The month you selected has 30 days.");
						   break;
		case  "april"    : System.out.println("The month you selected has 30 days.");
						   break;
		case  "june"     : System.out.println("The month you selected has 30 days.");
						   break;
		case "november"  : System.out.println("The month you selected has 30 days.");
						   break;
		case  "january"  : System.out.println("The month you selcted has 31 days."); 
		  				   break;
		case  "february" : System.out.println("The month you selected has 28 days and on a leap year it has 29 days.");
		         		   break;
		case  "march"    : System.out.println("The month you selcted has 31 days.");
		  				   break;
		case   "may"     : System.out.println("The month you selcted has 31 days.");
		  				   break;
		case  "august"	 : System.out.println("The month you selcted has 31 days.");
		  				   break;
		case "october"   : System.out.println("The month you selcted has 31 days.");
		  				   break;
		case "december"  : System.out.println("The month you selcted has 31 days.");
		  				   break;
		default          : System.out.println("Unrecognisable response please follow instuctions");
						   break;
		
		}	
		
		System.out.println("Please enter a number betwwen 0 - 7 : ");
		days = myScanner.nextInt();
		
		
		switch(days){
					case 0 : System.out.println("Monday");
					break;
					case 1 : System.out.println("Tuesday");
					break;
					case 2 : System.out.println("Wednesday");
					break;
					case 3 : System.out.println("Thursday");
					break;
					case 4 : System.out.println("Friday");
					break;
					case 5 : System.out.println("Saturday");
					break;
					case 6 : System.out.println("Sunday");
					break;
					case 7 : break;
			}
		
		
		
		
	}
}
