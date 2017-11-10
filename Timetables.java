
public class Timetables {
	public static void main(String[] args){
		int counter = 0;
		// since the for loop is outer it increments the the inner first before the outer 
		for(int i = 1;  i < 11; i++){
			if(i <= 5){	
				for( int numOne = 1; numOne < 11; numOne++ ){// the inner is incremented first
				int val = i * numOne;
				System.out.println(i + " x " +  numOne +  " = " + val);}
				System.out.println(" " + " \n" +"Press any key to continue... \n" );// this statement is then looped as soon as both the inner and the outer loop are finished 
			}
			else{
				for( int numTwo = 1; numTwo < 13; numTwo++ ){// the inner is incremented first
					int val = i * numTwo;
					System.out.println(i + " x " +  numTwo +  " = " + val);
		}
			System.out.println(" " + " \n" +"Press any key to continue... \n" );// this statement is then looped as soon as both the inner and the outer loop are finished 
	}
}			
	
	}
}
