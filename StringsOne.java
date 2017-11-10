import java.util.Scanner;
public class StringsOne {
public static void main(String[] args){
	Scanner myScanner = new Scanner(System.in);
	int vow = 0;
	String firstName = "Mohammed";
	String lastName  = "Kadiri";
	String str = firstName + lastName;//using the '+' add/concatenate the two names

	str = str.toLowerCase();//converts all the characters to lowercase
	
	System.out.println(str);
	
	System.out.println("Please enter a number in the range of 0 - 13: ");
	str = myScanner.nextLine();
	

	for(int i = 0; i <str.length();i++){
        if((str.charAt(i) == 'a') || (str.charAt(i) == 'e')  || (str.charAt(i) == 'i') ||   (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {
            System.out.println(" The String contains " + str.charAt(i));
        }
        vow++;
	}
	
}

}