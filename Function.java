
public class Function {
	public static String nametagText(String name){
		String say = "Hello, my name is " + name;
		System.out.println(say);
		return say;
	}
	public static void main(String[] args){
		String person = "John";
		nametagText(person);
	}
}
