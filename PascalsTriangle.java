import java.util.Scanner;
public class PascalsTriangle {
	public static void main(String[] args){
		int maxNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to be printed for pascals triangle ");
		maxNum = sc.nextInt();
		int num = 0;
		
		for(int row = 0; row <= maxNum; row++){
			for(int column = 1; column <= row; column++){
				System.out.print(++num + " ");
			}
			System.out.println();
		}
	}
}
