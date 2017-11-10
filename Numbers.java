
public class Numbers {
	public static void main(String[] args) {
		// Print numbers
		printNumbers(10);
	}
	public static void printNumbers(int num){
		if(num == 0){
			return;
		}else{
			System.out.println(num);
			printNumbers(num -1);
		}
	}
}
