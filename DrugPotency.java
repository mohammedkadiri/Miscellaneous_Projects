import java.util.Scanner;

public class DrugPotency {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double effect = 100;
		
		for(int i = 0; i < 1; i++){
			System.out.println( "month:" + i + " effectiveness: " + effect);
		}
		for(int i = 1; i < 20; i++){
			effect -= (100 / 100) * 4;
			if(effect > 50){
				System.out.println( "month:" + i + " effectiveness: " + effect);
			}
			else if(effect <= 50){
				System.out.println( "month:" + i +" effectiveness: " + effect + " Discarded");
			}
		}
	}
}
