
public class Calculator {
	public static double calculateTip(double cost){
		double tip = cost / 100 * 15;
		System.out.println(tip + " This is the cost");
		return tip;
	}
	public static void main(String[] args){
		double meal = 50;
		calculateTip(meal);
	}
}
