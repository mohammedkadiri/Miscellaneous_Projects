package ArraysandStrings;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.io.BufferedReader;
import java.util.Arrays;

public class FindLargestandSmallest {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		
		try{
			System.out.println("This program creates an array of a given size and fills it with random numbers. ");
			System.out.println("enter number of elements in the array : ");
			input = br.readLine();
			int elementCount = Integer.parseInt(input);
			int [] numbers = new int[elementCount];
			
			for(int count = 0; count < elementCount; count++){
				numbers[count] = (int)(Math.random() * 125 + Math.random() * 100);
			}
			System.out.println("Array elements: ");
			for(int count = 0; count < numbers.length; count++){
				System.out.print(numbers[count] + " ");
			}
			System.out.println("");
			
			Arrays.sort(numbers); 
			System.out.println("Sorted Array: ");
			for(int number: numbers){
				System.out.print(number + " ");
			}
			System.out.println("");
			
			System.out.println("The first largest number " + numbers[numbers.length-1]);
			System.out.println("The second largest number " + numbers[numbers.length-2]);
			System.out.println("The smallest  number " + numbers[0]);
			System.out.println("The second smallest number " + numbers[1]);
		}catch(Exception ex){
			System.out.println("catch exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
