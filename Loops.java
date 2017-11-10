import java.util.Scanner;
public class Loops {
	public static void main(String[] args) {
		int a = 100;
		
		do{
			
			a = a % 7;
			
			System.out.println(a);
		}while(a > 24);
		
		for(int i = 1; i <=4; i++){
			
			for(int j = 1; j <= 4; j++){
			System.out.print(j + " ");
			}
			System.out.println(" ");
			}

	}
	
}
