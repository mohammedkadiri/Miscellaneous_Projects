import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class JavaLessonEleven {
	public static void main(String[] args){
		ArrayList arrayListOne;
		
		arrayListOne = new ArrayList();
		
		ArrayList arrayListTwo = new ArrayList();
		
		ArrayList<String> names= new ArrayList<String>();
		
		names.add("John smith");
		names.add("Mohammed Alami");
		names.add("Oliver Miller");
		
		names.add(2, "Jack Ryan");
		
		names.set(0, "John Adams");
		
		names.remove(3);
		
		//names.removeRange(0,1);
		
		for(int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));	
		}
		
		System.out.println(names);
		
		for(String i : names){
			
			System.out.println(i);
		}
		
		Iterator indivItems = names.iterator(); // creates an iterator object 
		
		while(indivItems.hasNext()) // simply a boolean which tells it to iterate then prints out the values 
		{
			
			System.out.println(indivItems.next());
			
		}
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names); // copy's all the content inside the other arraylist 
		
		String paulYoung = "Paul young"; // declare  a string 
		
		names.add(paulYoung);// add a string 
		
		if(names.contains(paulYoung)){
			System.out.println("Paul is here");
		}
		
		if(names.containsAll(nameCopy)){
			System.out.println("Everything inside namesCopy is in names ");
		}
		// copied names to nameCopy
		
		names.clear();
		if(names.isEmpty()){
			System.out.println("Is empty");
		}
		
		Object[] moreNames = new Object[4];
		moreNames = nameCopy.toArray();
		
		System.out.println(Arrays.toString(moreNames));
		
	}
}
