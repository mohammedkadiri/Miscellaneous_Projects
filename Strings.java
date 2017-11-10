import java.text.DecimalFormat;
public class Strings {
	public static void main(String[] args){
		String team = "manchesterunited";
		int len = team.length();
		System.out.println(len);
		
		String str1 = "Chelsea";
		String str2 = " Vs Arsenal";
		System.out.println(str1.concat(str2));// concatenates the strings 
		
		
		System.out.println("mass effect".charAt(6));// finds the index of the character 
		String str3 = "mass effect".substring(0, 11);// finds the substring the (start position,end position )
		System.out.println(str3);
		
		String result = "Brandon favourite game ";
		result += str3;
		System.out.println(result);// another way to concatenate the string  however this more simply adding the string rather than actually concatenating it.
		
		String str4 = "December 25, 2018 12:00pm";
		System.out.println(str4.indexOf('2'));
		
		String str5 = "Hello", str6 = "World of Warcraft";
		boolean a = str5.equalsIgnoreCase(str6);
		int diffOne = str6.compareTo(str5);
		int diffTwo = str6.compareToIgnoreCase(str5);
		System.out.println(diffOne);
		System.out.println(diffTwo);
		System.out.println(a);
		System.out.println(	str5 = str6.trim());
		
		DecimalFormat money = new DecimalFormat("0.00");
		double amt = 25.789;
		String s = money.format(amt);
		System.out.println(s);
	
		String num = "-25", num2 = "128.38";
		int num1 = Integer.parseInt(num);
		double num4 = Double.parseDouble(num2);
		System.out.println(num1);
		System.out.println(num4);
	}
}
