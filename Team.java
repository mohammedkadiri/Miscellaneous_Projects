/**
 * File: Team.java
 * -------------------------------
 * A simple program which determines a team's results for a season
 */


import java.util.Scanner;

public class Team {
	public static void main(String[] args){
	    Scanner myScanner  = new Scanner(System.in);
		String  teamName   = "westbrom"; // even number for team name 
		int     gamesWon   =  teamName.length(); 
		int     gamesDrawn =  gamesWon / 2;
		int     gamesLost  =  28;
		
		int totalPointsForWin  = 3 * gamesWon; // total points for win
		int totalPointsForDraw = 1 * gamesDrawn; // total points for draw
		
		int goalsFor = 45;
		int goalsAgainst = 25;
		int goalsDifference = goalsFor - goalsAgainst;
		
		// uses casting to turn the int in to a double type and then multiply's by 100 and divide by 40 the total number of matches played which gives the percentage
		
		double percentageForWin = (double)gamesWon * 100 / 40; 
		double percentageForDraw = (double)gamesDrawn * 100 / 40;
		double percentageForLoss = (double)gamesLost * 100 / 40;
		
		System.out.println("The team name is ".concat(teamName) + "\nThey have won " + gamesWon + " games and they have drawn " + gamesDrawn + " and lost " + gamesLost + "\nThey have been able to accumulate " + totalPointsForWin + " points from winning their matches and " + "they gained " + totalPointsForDraw + " points for drawing" + "\nThey have a goal difference total of " + goalsDifference + ". \nTheir winnig percentage wasn't great this season " + percentageForWin + " % they have had a percentage of " + percentageForDraw + " % for draws this season and " + "they have a had a percentage of " + percentageForLoss + " % for losses this season. They have had an awful season just managing to stay a few spots away from the relegation zone ." );
	}
}
