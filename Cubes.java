/*
 * File: Cubes is simply a program which cubes and squares the user's input;
 */
import java.util.Scanner;
public class Cubes {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int limit = 0;
		int square = 0;
		int cube = 0;
		int i = 1;
		int squareForm = 0;
		int cubeForm = 0;
		System.out.println("Please enter the  amount of numbers which you want to add the sum of squares: ");
		limit = keyboard.nextInt();
		while(i <= limit ){
			square += i * i;// square the user input
			cube += i * i *i;// cubes the user's input
			squareForm = (i) * (i+1) * (2*i + 1) / 6;// the square formula 
			cubeForm = (i *i) * (i + 1)* (i +1) / 4;// the cube formula 
			i++;
		}
		System.out.println("The sum of Squares is " + square);
		System.out.println("The sum of Cubes is " + cube);
		System.out.println("The square formula " + squareForm);
		System.out.println("The cube formula " + cubeForm);
	}// end of the main method 
}// end of class
