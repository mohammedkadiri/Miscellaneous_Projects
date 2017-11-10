import java.util.Scanner;

public class Grade {
	public static void main(String [] args){
	Scanner myScanner = new Scanner(System.in);
	int marks = 0, students = 0, counter = 0;
	
	System.out.println("Hello could you please state the number of students you will be examining today: ");
	students = myScanner.nextInt();// user enters the amount of students they will input marks for
	
	while(counter <= students){
		System.out.println("Please enter your mark: ");
		marks = myScanner.nextInt();
		
		if(marks < 40 ){
			System.out.println("Your grade is an F");
		}
		else if(marks >= 40 && marks <= 54){
			System.out.println("Your grade is a D ");
		}else if(marks >= 55 && marks <= 69){
			System.out.println("Your grade is a C");
		}else if(marks >= 70 && marks <= 84){
			System.out.println("Your grade is a B");
		}else if (marks >= 85 && marks < 100 ){
			System.out.println("Your grade is a A");
		}else{
			System.out.println("Please enter a valid mark");
		}
		counter++;
		}
	}// end of main method
}//end of class 
