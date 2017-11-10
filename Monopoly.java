
public class Monopoly {
public static int numbers(int sides){
		double randomNumber;
			   randomNumber = Math.random();
			   randomNumber = randomNumber * 6;
			   randomNumber =randomNumber + 1;
			   int randomInt = (int)randomNumber;
			   System.out.println(randomInt + " The random ints");
			   return randomInt;
	}
public static int monopolyRoll(){
	int roll1 = numbers(6);
	int roll2 = numbers(6);
	int total = roll1 + roll2;
	if (roll1 == roll2) {
	int roll3 = numbers(6);
	int roll4 = numbers(6);
	total = total + roll3 + roll4;
	System.out.println(roll1 + " The first randomNumber");
	System.out.println(roll2 + " The second randomNumber");
	System.out.println(total + " The overall total");
	}
		return total;
		}
	
	public static void main(String[] args){
	int sides = 6;
	numbers(sides);
	monopolyRoll();
	}
}
