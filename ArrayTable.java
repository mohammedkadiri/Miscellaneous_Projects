import java.util.Arrays;
import java.util.Scanner;
public class ArrayTable {
	public static void main(String[] args){
		System.out.println("This is the current Array: ");
		int table[][] = {{1,2,3} , {4,5,6} , {7,8,9} , {10,11,12}};
		printArray(table);
		System.out.println();
		System.out.println("please enter a number: ");
		Scanner keyboard = new Scanner(System.in);
		int input = keyboard.nextInt();
		System.out.println("This is the new Array: ");
		printNewArray(table, input);
	}
	public static void printArray(int a[][]){// start of method
		for(int row = 0; row < a.length; row++){// start of row
			for(int column = 0; column < a[row].length; column++){
				System.out.print(  a[row][column] + " ");
			}// end of column
			System.out.println();
		}// end of row
			
	}// end of method
	public static void printNewArray(int a[][], int input){// start of method
		for(int row = 0; row < a.length; row++){// start of row
			for(int column = 0; column < a[row].length; column++){
				System.out.print(input * a[row][column] + " ");
			}// end of column
			System.out.println();
		}// end of row
		
	}// end of method

}// end of class

