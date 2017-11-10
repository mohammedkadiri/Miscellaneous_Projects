import java.util.*;

public class Guessinggame {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int user = 0;
		int limit = 1;
		int rounds = 1;
		int countWin = 1;
		int countLoss = 0;
		int countRound = 0;
		
		System.out.println("I am thinking of a number from 1 to 10.");
		System.out.println("You must guess what is in three tries");
		System.out.println(); 
		
		while(limit <= 11){
			
			System.out.println("round " + countRound + ":");
			System.out.println("Enter a guess: ");
			user = sc.nextInt();
			System.out.println();
			
			if(user == rand.nextInt(9)+1){
				System.out.println("You have won " + countWin + " out of " + countRound + " rounds.");
				System.out.println("Right!");
				System.out.println();
			
			
			}else if(user != rand.nextInt(9)+1){
				System.out.println("wrong");
				System.out.println("The correct number was " + rand.nextInt(9));
				System.out.println();
			}
			countRound++;
			countWin += countWin;
			limit++;
			
			if(limit == 12){
				if(countWin <= 5){
					System.out.println("You have won " + countWin + "out of " + countRound + " rounds");
					System.out.println("Your rating: " + "beginner");
				}
				if(countWin > 5 && countWin < 7){
					System.out.println("You have won " + countWin + " out of " + countRound + " rounds");
					System.out.println("Your rating: " + "amateur");
				}else if(countWin == 7){
					System.out.println("You have won " + countWin + "out of " + countRound + " rounds");
					System.out.println("Your rating: " + "intermediate");
				}else if(countWin > 7 && countWin < 10){
					System.out.println("You have won " + countWin + " out of " + countRound + " rounds");
					System.out.println("Your rating: " + "Professional");
				}
			
				
			}
		}
	
	}
}
