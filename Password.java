import java.util.Scanner;
public class Password {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String userInput;
		String passInput;
		String pass = "admin";
		String user = "james";
		System.out.println("Please enter password: ");
		passInput = keyboard.nextLine();
		System.out.println("Please enter name: ");
		userInput = keyboard.nextLine();
		
		while(!userInput.equals(user) && !passInput.equals(pass)){
			System.out.println("Please enter password again: ");
			passInput = keyboard.nextLine();
			System.out.println("Please enter name again: ");
			userInput = keyboard.nextLine();
		}while(userInput.equals(user) && passInput.equals(pass)){
			System.out.println("Thank you access granted");
			break;
		}
		
	}
}
