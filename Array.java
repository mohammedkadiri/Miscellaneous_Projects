import java.util.Arrays;
import java.util.*;
public class Array {
	public static void main(String[]args){
		ArrayList a = new ArrayList();
		a.add("what");// it stores the element in the index 
		a.add("is");
		Iterator x =  a. iterator();// It then iterates 
		while(x.hasNext()){
			System.out.println(x.next());
		}
		ArrayList<String> name = new ArrayList<String>();
		name.add("hi");
		name.add("my name is Mohammed");
		int howMany = name.size();
		System.out.println(howMany);
		name.set(0, "Hello");// This is used to change the element in the specific position
		System.out.println(name);
		String objects = name.get(0);
		System.out.println(objects);
		
		ArrayList<String> fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grape");
		
		int length = fruits.size();
		System.out.println(length);
		
		String entry = fruits.get(2);
		System.out.println(entry);
		
		
		
			}
			
}
	
	

