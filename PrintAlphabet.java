package loops;
/**
 * 
 * A simple program which prints letters A to Z
 *
 */

public class PrintAlphabet {
	public static void main(String[] args){
	// Prints alphabets from A to Z
		System.out.println("Prints alphabets from A to Z");
		for(int ch = 'A'; ch <= 'Z'; ch++){
			System.out.println((char)ch);
		}
	}
}
