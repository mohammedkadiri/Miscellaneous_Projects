/**
 * File: Gyms.java
 * -------------------------------
 * A simple program to determine if the user is a member and if the user is a member member then ask for the age and assign the gym charges for the user
 */

import java.util.Scanner;

public class Gyms {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int age = 0;
		String euro = "\u20AC"; // euro Unicode literal 
		boolean member = true;
		
		System.out.println("Are you a member true / false : ");
		member= myScanner.nextBoolean();// boolean input required
		if(member == false){// if boolean is false display this to the view and don't proceed to ask the user for their age 
			System.out.println("Unfortunately as you are not a member you will have to pay " + euro + "6");
		}
		
		if(member == true){// nested if statement if boolean is true ask the user for age and then determine the gym charge for the member
		
		System.out.println("Please enter your age:");
		age = myScanner.nextInt();
		
		if(age == 10 || age <=20){
			System.out.println("You will have to pay " + euro + "4");
			}else if(age > 20 && age <=31 ){
				System.out.println("You will have to pay " + euro + "5");
			}else{
				System.out.println("sorry you have to be in the age range between 10 - 31");
			}
		}
	}// end of main method 
}// end of class method
