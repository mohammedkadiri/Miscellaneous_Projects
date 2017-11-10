import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int teamA = 0, pointsA = 0, scoreA = 0;
		int teamB = 0, pointsB = 0, scoreB = 0;
		
		System.out.println("\'This is Question three the Croke Park one with\'");
		System.out.println("Please enter the results for the match as follows. ");
		System.out.print("\n Please enter the number of goals for team a: ");
		teamA = myScanner.nextInt();
		System.out.print("\n Please enter the number of goals for team b: ");
		teamB = myScanner.nextInt();
		System.out.println("\n Please enter the number of points for team a: ");
		pointsA = myScanner.nextInt();
		System.out.println("\n Please enter the number of points for team b: ");
		pointsB = myScanner.nextInt();
		
		scoreA = teamA + pointsA;
		scoreB = teamB + pointsB;
		
		if(scoreA > scoreB){
			System.out.println("Congrutalations to team a for winning the match");
		}
		else if(scoreA < scoreB){
			System.out.println("Congrutalations to team a for winning the match");
		}else{
			System.out.println("The match was fantastic however it ended in a draw");
		}
		System.out.println("\t" + "Thank you for taking a look at the scoreboard.");
	}
}
