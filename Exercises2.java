
public class Exercises2 {
	public static void main(String[] args){
		float total = 14000;
		System.out.println("This is the investment $ " + total);
		// Increases by 40% after the first year
		total = total + (total * .4F);
		System.out.println("This is the amount after the first year $ " + total);
		total = total - 1500F;
		System.out.println("This is the amount after the second year $ " + total);
		total *= 1.2F;
		System.out.println("this is the amount after the third year $ " + total);
		
		int numOne = 250;
		int numTwo = 2;
		int divide = (numOne / numTwo);
		int modulo = (numOne % numTwo);
		
		System.out.println("This is the division of the first two numbers: " + numOne + " / " +numTwo + " = " + divide);
		System.out.println('\t'+ "This is the modulo of the two numbers: " + numOne + " % " + numTwo + " = " + modulo);
	}
}
