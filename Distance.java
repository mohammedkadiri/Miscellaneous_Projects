/**
 * File: Distance.java
 * -----------------------------------------------------------------------------
 * A simple program which calculates the nearest distance to which a user enters.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Distance {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);// Scanner object to get the user input 
		int x = 0;
		int y = 0;
		boolean running = true;// running will always result to true for the while loop
		char user;// coordinate points entered from the user
		double distance;// distances compared to the shortest distance
		double shortestDistance = 0;// finds the shortest distance compared to other distances
		int [][] gps = {{2,1}, {15,4} ,{11,3}, {3,4}, {-1,2}, {3,4}};// The points which will be compared to find the nearest distance the user inputs
		System.out.println("Please enter the coordinates of your location (x,y):");
		System.out.println("Please enter the x: ");
		x = keyboard.nextInt();
		System.out.println("Please enter the y: ");
		y = keyboard.nextInt();
		
		System.out.println("Your coordinates are: " + '(' + x + ',' + y + ')' + "if your coordinates are not correct could you please enter (y/n): " );
		user = keyboard.findWithinHorizon(".",0).charAt(0);
		
		while(running){
			if(user == 'y'|| user == 'Y'){// if the user enters y or Y should print the statement inside the block
				System.out.println("Thank you for entering your coordinates now time to find the nearest restaurant");
				break;// break out of the loop after printing the message to the screen
			}else{// if the user enters another character it should ask the user to input the points again
				System.out.println("Please enter the coordinates of your location (x,y) again:");
				System.out.println("Please enter the x: ");
				x = keyboard.nextInt();
				System.out.println("Please enter the y: ");
				y = keyboard.nextInt();
				break;
			}
		}
		for(int row = 0; row < gps.length; row++){// iterates over the array and returns the length of the array
			for(int column = 0; column < gps[row].length;){// iterates over the elements inside the array both the column and the row 
				distance = distance (gps[row][0], gps[row][1], gps[column][0], gps[column][1]);// sets the distance to the first and second coordinates in the array
				if(shortestDistance < distance){// compares the all the other distances to the distance and if they the distance is shorter it returns the points
					x = row;// the row coordinate
					y = column;// the column coordinate
					shortestDistance = distance;//  the shortest distance stores the coordinates of the distance
				}
				System.out.println("The nearest distance is" + "(" + gps[y][0] + " , " + gps[y][1] + ")" );// prints out the nearest distance to which the user picked 
			
			}
		}// end of the main method 
	}// end of class 
	
	public static double distance(double x1, double y1, double x2, double y2){// A simple method to calculate the distance using the distance formula 
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );
	}
}
