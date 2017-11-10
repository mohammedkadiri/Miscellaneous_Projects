
import java.util.*;

public class PhoneNumber {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String phoneNumber = "";
		boolean isValidPhoneNumber = false;
		
		System.out.println("This program validates the format of the north america phone number ");
		System.out.println("Please enter the phone number in XXX-XXX-XXXX format or in (XXX)-XXX-XXXX format");
		phoneNumber = keyboard.nextLine();
		isValidPhoneNumber = validatePhoneNumber(phoneNumber);
		
		if(isValidPhoneNumber) {
			System.out.println("Phone number is valid");
		}
		else {
			System.out.println("Phone number is invalid!");	
		}
		
	}
	
	public static boolean validatePhoneNumber(String number) {
		boolean isValidPhoneNumber = true;
		number = number.trim();
		int index1 = number.indexOf('-');
		int index2 = number.lastIndexOf('-');
		
		if(index1 == -1 ||  index2 == -1 
				|| index1 >=  number.length()-1
				|| index2 >=  number.length()-1) {
			isValidPhoneNumber = false;
		}
		else {
			String areaCode = number.substring(0, index1).trim();
			String exchange = number.substring(index1 + 1, index2).trim();
			String mobile   = number.substring(index2 + 1 ).trim();
			
			if(!validateAreaCode(areaCode)
					|| !validateNumber(exchange, 3)
					|| !validateNumber(number, 4)) {
				isValidPhoneNumber = false;
			}
		}
		return isValidPhoneNumber;
	}
	
	public static boolean validateAreaCode(String areaCode) {
		boolean isvalid= true;
		int digitCount = 0;
		
		for(int count = 0; count < areaCode.length(); count++) {
			char tempChar = areaCode.charAt(count);
			if(tempChar >= '0' && tempChar  <= '9') {
				digitCount++;
				continue;
			}
			else if(tempChar == ' ') {
				continue;
			}
			else if(count == 0 && tempChar == '(') {
				continue;
			}
			else if(count == (areaCode.length()-1) && tempChar == ')') {
				continue;
			}
			else {
				isvalid = false;
				break;
			}
		}
		isvalid = isvalid && digitCount == 3;
		return isvalid;
	}
	
	public static boolean validateNumber(String number, int expectedDigitCount) {
		boolean isvalid= true;
		int digitCount = 0;
		
		for(int count = 0; count < number.length(); count++) {
			char tempChar = number.charAt(count);
			if(tempChar >= '0' && tempChar  <= '9') {
				digitCount++;
				continue;
			}
			else if(tempChar == ' ') {
				continue;
			}
			else {
				isvalid = false;
				break;
			}
		}
		isvalid = isvalid && digitCount == 3;
		return isvalid;
	}
}
