import java.util.Scanner;
public class SquareBoard {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= 5; j++){
				System.out.print('#' + " " );
			}
		System.out.println();
		
		}
		for(int k = 1; k < 5; k++){
			for(int l = 5; l > k; l--){
				System.out.print('*' + " ");
				}
			System.out.println();
	}
		for(int m = 1; m <= 5; m++){
			System.out.print(" ");
			for(int n = 1; n < m ; n++){
				System.out.print( '*' );
			}
			System.out.println();
		}
	}
}
