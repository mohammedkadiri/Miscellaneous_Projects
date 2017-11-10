import java.util.*;
import java.util.Arrays;

public class AddressBook {
	
	static int position = 0;
	static String [] name = new String[100];
	static int[] phone = new int[100];
	static String[] homeTown = new  String[100];
	static String[] horoscope =  new String[100];
	
	public static void main (String[] args){
	int option = 0;
		
		
		do{
			menu();
			option = returnInt();
			if(option == 1){
				inputRecord();
			}
			 if(option == 2 ){
				searchRecords();
			}//end first if
			 if(option == 3 ){
				printRecords();
			}
			
		}while(option != 4);
		
	
	}// end of the main method
	
	public static void menu(){
		System.out.println("********** MENU *********");
		System.out.println("1 - New Record Add");
		System.out.println("2 - Search Record");
		System.out.println("3 - Print Record ");
		System.out.println("4 - Exit");
	}
	
	public static int returnInt(){
		Scanner key = new Scanner(System.in);
		int storeInt = key.nextInt();
		return storeInt;
	}
	
	public static String returnString(){
		Scanner key = new Scanner (System.in);
		String storeString = key.nextLine();
		return storeString;
	}
	
	public static void inputRecord(){
		System.out.println("Please input your name: ");
		name[position]= returnString();
		System.out.println("Please input your phone number: ");
		phone[position] = returnInt();
		System.out.println("Please input your home town: ");
		homeTown[position] = returnString();
		System.out.println("Please input your zodian sign: ");
		horoscope[position] = returnString();
		System.out.println();
		System.out.println("Record successfully added");
		position++;
		
	}
	
	public static void searchRecords(){
		System.out.println("Please insert name of record: ");
		String nameCompare = returnString();
		
		
		for(int i = 0; i < name.length; i++){
			if(nameCompare.equalsIgnoreCase(name[i])){
				System.out.println(i + " " + name[i] + " phone no: " + phone[i] + " homeTown " + homeTown[i] + " horoscope " + horoscope[i]);
			}
		}
		System.out.println("Search has been succefully completed.");
		
	}
	
	public static void printRecords(){
		
	}
}// end of the class
				
			
				
		
		
		
	

