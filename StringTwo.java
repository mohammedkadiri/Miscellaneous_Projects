/**
 * 
 * File: StringTwo.java
 * ----------------------------
 * This is a simple program which uses different String methods to compare, to concatenate, to find difference and the length.
 *
 */
public class StringTwo {
	public static void main(String[] args){
		String str1 = "mike";
		String str2 = "david";
		String str3 =  str2;
		String str4 = "Loughlinstown"; 
		String str5 = "town";
		System.out.println("String 1 has " + str1.length() + " characters.");// finds the length of string
		System.out.println("String 2 has " + str2.length() + " characters.");
		
		if(str1.length() > str2.length()){
			System.out.println("String 1 is therefore longer");
		}else{
			System.out.println("String 2 is longer");
		}
		
		boolean a = str3.equals(str2);
		System.out.println(a);// returns true if the string is equal
		
		int diff = str3.compareTo(str2);
		System.out.println("This is the difference " + diff);// checks to find the difference between the two strings
		
		String str6 = str5.substring(0,4) + str4.substring(0, 13);
		System.out.println(str6);
		
	}
}
