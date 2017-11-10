
public class Multiples {
	public static void main(String[] args){
		int counter = 0;// intialize a counter variable to keep count of the multiples
		for(int i = 1; i < 1000; i++){
			if(i % 5 == 0 || i % 3 == 0){// if number is a multiple of five or three then add it
				counter += i;
			}
		}
		System.out.println(counter);// Print the count 
	}
}
